import java.util.Arrays;

public class ReturnMissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] statues = {6,2,3,8};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<statues.length;i++) {
			max = Math.max(max, statues[i]);
			min = Math.min(min, statues[i]);
		}
		System.out.println("length :"+statues.length); 
		System.out.println((max-min)+1-statues.length); 
		
	}

}

/*
 * Find the Smallest and Largest Element in Array.
 * 
 * Get the count of can say, difference of Largest and Smallest value of array
 * in order to calculate, how many elements must be there to make it as a
 * continuous array . Like from 5 to 9, count of total elements must be 5 (
 * i.e.5,6,7,8,9) and also add 1 to the result to make count inclusive.
 * 
 * Find the Length of the Array
 * 
 * Subtract the count i.e. "difference of largest and smallest value " with the
 * length of array
 */