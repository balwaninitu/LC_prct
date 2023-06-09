package KK;
//
public class FindInMountainArray1095 {
//https://leetcode.com/problems/find-in-mountain-array/
	
	/* approach 
	 * Find peak element 
	 * Binary search in asc array 
	 * if not found binary search in desc array
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5,3,1};
		int[] arr = {0,1,2,4,2,1};
		int target=2;
		int ans = search(arr, target);
		System.out.println(ans);

	}
	
	static int search(int []arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBS(arr,target,0,peak);
		if(firstTry != -1) {
			return firstTry;
		}
		//try second half
		return orderAgnosticBS(arr,target,peak+1,arr.length-1);
	}
	
	static int peakIndexInMountainArray(int[]arr) {
		int start=0;
		int end=arr.length-1;
		while(start< end) {
			int mid = start +(end-start)/2;
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start =  mid+1;
			}
			
		}
		
		return start;	
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
	
	static int orderAgnosticBS(int[] arr, int target,int start, int end) {
		 start=0;
		 end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target == arr[mid]) {
				return mid;
			}
			if(isAsc) {
				if(target < arr[mid] ) {
					end = mid-1;
				}else {
					start=mid+1;
				}
			}else {
				if(target > arr[mid] ) {
					end = mid-1;
				}else {
					start=mid+1;
				}
				
			}
			
		}
		return -1;
		
	}

}
