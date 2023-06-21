package KK;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * most important and get asked in many companies for same pattern
		 * sorting in single pass
		 * when given nos. from range 1,N find missing no => use cyclic sort.
		 * when there is range given use cyclic sort
		 * here start from beginning and check if no. is at correct index
		 * then we swap for correct index then new element at index zero will
		 * get check and swap for correct index
		 * worst case: O(n), its a linear
		 */
		
		int[] arr = {9,8,7,6,5,4,3,2,1};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void cyclicSort(int[] arr) {
		//check swap move
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i] -1;//if element is 3 its index should be 2
			if(arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}else {
				i++;
			}
		}
		
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
