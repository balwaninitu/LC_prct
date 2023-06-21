import java.util.ArrayList;
import java.util.Arrays;

public class ExtractEacgKth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int [] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int size = inputArray.length;
		int[] ans = new int[size-size/k];
		int pointer=0;
	    for(int i=0; i<inputArray.length;i++){
	       if((i+1)% k != 0) {
	    	   ans[pointer] = inputArray[i];
	    	   pointer++;
	    	   
	       }
	       
	        
	    }
	    System.out.println(Arrays.toString(ans));

	}

}
