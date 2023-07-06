package KK;

import java.util.Arrays;
//
public class BSIn2DArray {
/*search in 2D array
 * we will start with 2 pointers
 * one will be row[0] and other will be last element of row
 * when target less than last row of element col++
 * when target greater than element row++
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		int target=39;
		
		
		System.out.println(Arrays.toString(search(arr, target)));

	}
	
	public static int[] search(int[][] matrix, int target) {
		int r =0;
		int c =matrix.length-1;
		
		while(r<matrix.length && c >=0) {
			if(matrix[r][c] == target) {
				return new int[] {r,c};
			}
			if(matrix[r][c]<target) {
				r++;
			}else {
				c--;
			}
		}
		return new int[] {-1,-1};
	}

}
