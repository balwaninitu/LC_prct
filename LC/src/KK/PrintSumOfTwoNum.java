package KK;

import java.util.Scanner;

public class PrintSumOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum();
		//6
		sum();
		
		int ans = sum2();
		
		System.out.println("The ans = "+ans);
		
		int ans1 = sum3(6,7);
		System.out.println("The ans1 = "+ans1);
		
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.print("Enter number 1 : "); int num1 = in.nextInt();
		 * 
		 * System.out.print("Enter number 2 : "); int num2 = in.nextInt();
		 * 
		 * int sum = num1 + num2;
		 * 
		 * System.out.println(sum);
		 */

	}
	
	
	//create method to call many times from main method
	
	static void sum() {
		
        Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		int num1 = in.nextInt();
		
		System.out.print("Enter number 2 : ");
		int num2 = in.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum = "+sum);
		
	}
	
	static int sum2() {
		
		 Scanner in = new Scanner(System.in);
			
			System.out.print("Enter number 1 : ");
			int num1 = in.nextInt();
			
			System.out.print("Enter number 2 : ");
			int num2 = in.nextInt();
			
			int sum = num1 + num2;
			
			return sum;
		
	}
	
	//pass the value of numbers when calling method
	
	static int sum3(int a, int b) {
		int sum = a+ b;
		return sum;
	}
	

}
