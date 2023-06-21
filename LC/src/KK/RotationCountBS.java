package KK;

public class RotationCountBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*no. of rotation of array can be found out by
		 * counting how many elements before pivot +1
		 */
		//int [] arr = {4,5,6,7,0,1,2};
		int [] arr = {1,2,3,4,5,6};
		System.out.println(countRotations(arr));

	}
	public static int countRotations(int[]arr) {
		int pivot = findPivot(arr);
		return pivot +1;
		//if array not rotated it will return -1 then pivot -1+1=0
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

}
