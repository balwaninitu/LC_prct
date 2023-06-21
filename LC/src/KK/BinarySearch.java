package KK;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorted array ascending
		int[] arr = {112,89,34,23,12,11,5,2,0,-2,-6};
		int []arr1 = {-3,-1,0,4,8,12,78,90,111,453,678,890};
		int target=78;
		//int ans = binarySearch(arr,target);
		//System.out.println(ans);
		
		int ans1 = orderAgnosticBS(arr1,target);
		System.out.println("order agnostic "+ans1);
		

	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			//below value if sometime very big then
			//it wont fit in java integer
			//int mid = (start+end)/2;
			int mid = start + (end-start)/2;//take this to big adjust value in java integer
			
			if(target < arr[mid] ) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
		
		
	}
	
	//order agonistic binary search
	//when not sure array is sorted ascending or descending
	static int orderAgnosticBS(int[] arr, int target) {
		int start=0;
		int end = arr.length-1;
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
