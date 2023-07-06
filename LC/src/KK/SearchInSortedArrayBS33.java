package KK;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//
/*Rotated array
 * 
 * Rotation array means last element will come & other
 * all element shift to right, it is called 1 rotation
 * 
 * Approach:
 * 1. find pivot in the array
 * Pivot is one where rotation occurs or its the largest ele in array
 * after pivot next number is in asc order
 * e.g.[3,4,5,6,7,0,1,2]
 * here 7 is pivot after this there is asc no. 0,1,2
 * 
 * 2.search in first half sorted array from 0 to pivot
 * 3. if not found search in second half (pivot+1 to end)
 * 
 * Find pivot approach:
 * there will be only one part where two element desc
 * i.e after 7 there is 0 in above array which is desc
 * rest all are asc\
 * case 1: when mid is > (more than) mid+1 that mid is pivot
 * 
 * case 2 : if mid(here mid is 0) less than mid-1(7)
 * then we got pivot
 * 
 * case 3: If middle element is smaller(3) than start(4)
 * [4,5,6,3,2,1,0] then all numbers after mid will be smaller than or equal
 * start if its sorted array, since we are looking for pivot which is 
 * largest element so we can ignore all element after mid, here end will be
 * end = mid-1;
 * 
 * case 4: If start element is smaller than mid element 
 * then we can ignore all ele before mid here start will be
 * start = mid+1;
 * e.g[3,4,5,6,7]
 * 
 * 
 * Find target sfter finding pivot:
 * ----------------------------------
 * case 1:Pivot element == target //ans
 * case 2: target > start element search from start till pivot-1;
 * case 3: target < start element search from pivot+1 till end
 * 
 * */
public class SearchInSortedArrayBS33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6,7,2,3,1};
      int ans = findPivot(arr);
      System.out.println(ans);
	}	
	
	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);
		
		//if pivot not available
		if(pivot == -1) {
			//do normal binary search
			return binarySearch(nums, target, 0, nums.length-1);
				
			}
			//if pivot found, there will be 2 asc sorted arrays
		   if(nums[pivot] == target) {
			   return pivot;
		}
		   if(target >= nums[0]) {
			   return binarySearch(nums, target, 0,pivot-1);
		   }
		   return binarySearch(nums, target, pivot+1, nums.length-1);
	}
	//this will not work for duplicate values in array
	//it will work only for distinct value
	static int findPivot(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			//4 cases
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] <= arr[start]) {
				end= mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	static int binarySearch(int[]arr,int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	//when array has duplicates values
	static int findPivotWithDuplicates(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			//4 cases
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid] <= arr[start]) {
				end= mid-1;
			}else {
				start=mid+1;
			}
			
			//if elements at middle, start, end are equal then skip duplicates
			if(arr[mid] == arr[start] && arr[mid]==arr[end]) {
				//skip the duplicates
				
				//check if start is pivot
				if(arr[start] > arr[start+1]) {
					return start;
				}
				start++;
				//check if end is pivot
				if(arr[end] < arr[end-1]) {
					return end-1;
				}
				end--;
				
			}
			//left side is sorted, so pivot should be in right
			if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])) {
				start = mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	

}
