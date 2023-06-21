package KK;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{2,3,7},
				{6,7,29},
				{7,1,231}
		};
		int target = 2;
		int max = arr[0][0];
		int[] ans = search(arr,target);
		int ans1 = searchMax(arr,max);
		
		//System.out.println(search(arr,target));
		System.out.println(Arrays.toString(ans));
		System.out.println("Max "+ans1);

	}
	
	static int[] search(int[][] arr, int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col] == target ) {
					return new int[]{row,col};
				}
			}
		}
		return new int[]{-1,-1};
		
		
	}
	
	//find max in 2d Array
	/*static int searchMax(int[][] arr, int max) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col] > max ) {
					max = arr[row][col];
					
				}
			}
			
		}
		return max;
		
		
	}*/
	
	//for each loop
	static int searchMax(int[][] arr, int max) {
		for(int[] row:arr) {
			for(int element:row) {
				if(element > max) {
					max = element;
				}
			}
		}
		return max;
	}

}
