package KK;

import java.util.Arrays;
//
public class BubbleSortIntro {
	
	/*
	 * Bubble sort is comparison sort method
	 * Sorting array step by step
	 * Bubble sort, in every step there is compariosn between
	 * adjacent element,if first element greater than 2nd then swap
	 * with first pass through array , we get largest element in the end
	 * with second pass, second largest element came second last
	 * with every step, largest element remaining in array will come at its 
	 * position
	 * It is also know as sinking or exchange sort.
	 * 
	 * here two pointers will be there(i=0) & (j will be internal loop)
	 * there will be comparison if j less than j-1 if yes swap
	 * 
	 * Inplace sorting algorithm - No extra space required or copying
	 * the array not required
	 * 
	 * Space complexity - 0(1)
	 * 
	 * 
	 * Time complexity- when j never swaps it means array is sorted
	 * Best case comparison = n, its actually n-1 but we take ignore 
	 * constant in time complexity
	 * where N is size of array
	 * 
	 * Worst case: When array is desc
	 * Total comparison = (N-1)+(N-2)+(N-3)+(N-4)
	 * = 4N-(1+2+3+4)= 4N-N*(N+1)/2
	 * = 4N-(N2+N/2) = 8N-N2-N/2=7N-N2/2=O(N2)(o of n square)
	 * 
	 * It is stable sorting algo, when you have order which has same
	 * value then the order will maintain in same order(when original order
	 * maintain for same value is called stable sorting but if the order not
	 * maintain for same value then thtas unstable sorting)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,0,-3,4,-1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	static void bubbleSort(int[]arr) {
		boolean isSwap;
		for(int i=0;i<arr.length;i++) {
			isSwap = false;
			//for each step, max item will come at the last respective index
			for(int j=1;j<arr.length-i;j++) {
				//swap if element is smaller than previous
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSwap=true;
				}
			}
			//if not swap for particular value of i
			if(!isSwap) {
				break;
			}
		}
	}

}
