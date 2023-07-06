package KK;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class binarySearchInfiniteArray {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we can not take length for infinite array
		 * instead start from small size & increase exponetially
		 * 2,4,8,16,etc
		 * while condition will be when target is greater than end
		 * here we dont need to compare with start because start will always be 
		 * less than end because we are moving two pointers in sorted
		 * asc array
		 */
		int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
		int target=10;
		//int ans = infiniteArray(arr,target);
		System.out.println(infiniteArray(arr,target));

	}
	
	static int infiniteArray(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while(target > arr[end]) {
			int newStart = end+1;
			//double the value, end=prev end + size of box*2
			end = end + (end-start+1)*2;
			start=newStart;
		
		}
		return binarySearch(arr,target,start,end);
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
	
	
	
	

}
