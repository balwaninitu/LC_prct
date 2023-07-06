package KK;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInArray852 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mountain array = increasing then decreasing array
		 * It also known as bitonic array
		 * we can use binary search since array is sorted
		 * in the end start and end both will point to same number
		 * we dont have target value here so we compare if element beside 
		 * middle is more or less
		 */
		
		int[] arr = {1,2,3,4,8,3,2,1};
		System.out.println(mountainArray(arr));

	}
	static int mountainArray(int[]arr) {
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid] > arr[mid+1]) {
				//here pointer is at desc part of array
				//mid may be ans but check at left if there is still number greater than mid
				//hence end != mid-1
				end = mid;
			}else {
				start = mid+1;//here we know mid hence we check ele next to mid
			}
			
		}
		return end;//return start or end as both are equal
		
	}

}
