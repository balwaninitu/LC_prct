package KK;

import java.util.Scanner;

public class FindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fibonacci series is addition of two prev no. 0,1,1,2,3,5,8....
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		//initialize first two number 
		int a = 0;
		int b = 1;
		//count is 2 because whe have already two number
		int count = 2;
		
		while(count <= n) {
			int temp = b;
			b = b+a;
			a = temp;
			count++;
		}
		
		System.out.println(b);
		

	}

}
