package KK;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 13452;
		
		//get the last number then multiply by 10 to add next number
		int ans = 0;
		
		while(n > 0) {
			
			int rem = n % 10;
			n /= 10;
			ans = ans *10 + rem;
			
			
		   
		}
		
		System.out.println("ans :"+ans);

	}

}
