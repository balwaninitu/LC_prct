package KK;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please eneter number : ");
		int n = in.nextInt();
		boolean ans = isPrime(n);
		System.out.println(ans);

	}
	
	static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		int c = 2;
		
		while(c*c <= n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		//return true;
		return c*c > n;
		
	}

}
