package KK;
//
import java.util.Scanner;

public class FindLargestInputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		//Q: find the largest of the 3 numbers
		//1. Approach
		int max = a;
		if(b > max) {
			max = b;
		} 
		if(c > max) {
			max = c;
		}
		
		System.out.println(max);
		
		//2. Approach
		if(a > b) {
			max = a;
		}else {
			max=b;
		}
		
		if(c > max ) {
			max = c;
		}
		
		//3. Approach 
		int maxi = Math.max(c, Math.max(a, b));
		System.out.println(maxi);

	}

}
