package KK;
//https://leetcode.com/problemset/all/
public class CyclicSortFindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int findDuplicatesNumber(int[]arr) {
		int i=0;
		while(i<arr.length) {
			
			if(arr[i] != i+1) {
			int correctIndex=arr[i]-1;//if element is 3 its index should be 3
			if(arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}else {
				return arr[i];
			}
		}else {
			i++;
		}
	}
		return -1;
		
	}
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	
	

}
