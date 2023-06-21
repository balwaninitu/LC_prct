
public class DigitDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 91;
		 int counter=0;
		    while(n >= 10){
		      counter++;
		      int sum=0;
		      while(n >0 ){
		          sum+= n%10;
		          n /=10;
		      } 
		      n=sum; 
		      System.out.println("sum+= n%10 :"+ sum + n%10); 
		      System.out.println("sum :"+sum); 
		    }
		    System.out.println("counter :"+counter); 

	}

}
