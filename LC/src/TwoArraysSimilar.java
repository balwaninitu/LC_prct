import java.util.Arrays;

public class TwoArraysSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2};
		int[] b = {3,2,1};
		
		 int cnt = 0;
		    boolean result = false;
				
		    for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					cnt++;
					}
				}
		    System.out.println(cnt);
			    
			Arrays.sort(a);
			Arrays.sort(b);
					
			if(Arrays.equals(a, b)){
				if(cnt <= 2) { 
					result = true; 
				} else {result = false;}
			} else {
				result = false; 
				}           
			System.out.println(result);

	}

}
