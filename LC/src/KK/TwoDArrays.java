package KK;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
		
		Scanner in = new Scanner(System.in);
		//declaring column size is not compulsory in java 
		//only row size is compulsory
		int[][] arr = new int[3][3];
		for (int row=0;row<arr.length;row++) {
			for (int col=0; col<arr[row].length;col++) {
				arr[row][col] = in.nextInt();
				
			}
		}
		
		//output
		/*for (int row=0;row<arr.length;row++) {
			for (int col=0; col<arr[row].length;col++) {
				System.out.print(arr[row][col] + " ");
				
			}
			System.out.println();
		}*/
		
		//OR
		for (int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
			
		}
		//for each loop
		for(int[] num : arr) {
			System.out.println("for each looo "+Arrays.toString(num));
		}
		
		

	}

}
