package KK;

public class CyclicSortLC41 {
	//https://leetcode.com/problems/missing-number/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,0,1};
		int ans = missingNumber(arr);
		System.out.println(ans);

	}
	
	static int missingNumber(int[]arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i];//if element is 3 its index should be 3
			if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}else {
				i++;
			}
		}
		//search for first missing number
		for(int index=0; index<arr.length;index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		
		//case 2
		return arr.length;
		
	}
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	

}
