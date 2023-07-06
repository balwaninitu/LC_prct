package KK;
//
public class OccurenceOfSameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1385757879;
		
		int count =0;
		
		while(n >0) {
			//rem will give last number
			int rem = n%10;
			
			if(rem == 7) {
				count++;
			}
			//shifting to second last & so on
			n = n/10; // n /= 10;
		}
		
		
		System.out.println(count);

	}

}
