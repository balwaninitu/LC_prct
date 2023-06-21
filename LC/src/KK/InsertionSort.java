package KK;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * In inserion sort sorting is partial,it sorts in parts
		 * e.g.sorts untill index 1 then untill index 3 & so on
		 * After every pass, some part will get sorted
		 * 
		 * Time Complexity:
		 * worst case=O(n2)(desc sorted)- this will take N2 comparison
		 * Best case: when array is sorted
		 * 
		 * why use:
		 * 1. adaptive: Step get reduced if array sorted.
		 * no. of swaps reduced compared to bubble sort.
		 * 
		 * 2. It is stable
		 * 3. it is used for smaller values of N. works good when array is 
		 * partially sorted.it takes part in hybrid sorting algorithm.
		 * 
		 * 
		 */
		int[] arr = {2,67,12,34,90,23,5,-9,-23};
		insertion(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]< arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;//beacuse left hand side is sorted
				}
			}
		}
		
	}
	
	static void swap(int[]arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}

}
