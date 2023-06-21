package KK;

import java.util.Arrays;

public class SelectionSortAlgo {
	
	/*
	 * Select an element and put at correct index
	 * e.g select largest element and put at correct index then second largest
	 * and so on or select smallest at put at correct index
	 * there will be N-1 comparisons
	 * worst case O(n2)
	 * best case= O(n2)
	 * this is not stable sorting
	 * It performs well on small arrays
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,5,4,2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//find the max item in the remaining array
			//and swap with correct index
			int last =arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0,last);
			swap(arr,maxIndex,last);
		}
	}
	
	private static int getMaxIndex(int[]arr,int start, int end) {
		int max=start;
		for(int i=start; i<=end;i++) {
			if(arr[max] < arr[i]) {
				max=i;
			}
		}
		return max;
	}
	
	static void swap(int[]arr, int first,int second) {
	int temp=arr[first];
	arr[first] = arr[second];
	arr[second] = temp;
	
	
}
}
