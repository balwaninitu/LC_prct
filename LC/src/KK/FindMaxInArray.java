package KK;
//
public class FindMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,23,4,75,6};
		System.out.println(max(arr));
		System.out.println(maxRange(arr, 1,3));

	}
	
	static int max(int[] arr) {
		//if array is empty can start with integer min value
		//if array not empty
		if(arr.length == 0) {
			return -1;
		}
		int maxVal = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
			
		}
		return maxVal;
	}
	
	//find max in range
	static int maxRange(int[] arr, int start, int end) {
		//if array is empty can start with integer min value
		//if array not empty
		
		//handling edge cases
		if(end > start) {
			return -1;
		}
		if(arr == null) {
			return -1;
		}
		int maxVal = arr[start];
		for(int i=start;i<=end;i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
			
		}
		return maxVal;
	}
	
	

}
