import java.util.Arrays;

public class ArrayIncreasing1827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,5,2,4,1};
		
		//make array in increasing order so new array will be
		//{1,5,6,7,8}
		//diff bet new & old array is 14(21-7=14) so return 14
		int diff=0;
 	    for(int i=1;i<array.length;i++) {
 	    	if(array[i]<= array[i-1]) {
 	    		int temp = array[i];
 	    		array[i] = array[i-1]+1;
 	    		diff+=array[i] - temp;
 	    	}
	    	
	    }
	    System.out.println("diff :"+diff);
		
		System.out.println(Arrays.toString(array));

	}

}

/*In above problem, array has to make in increasing order
 * and find out diff between new and old element dont include same num
 * in both arrays(old & new)
 * Approach:
 * Run loop along array check if num is less than prev num
 * if yes use swap, in temp hold existing value AND THEN NEW ARRAY NUM WILL BE
 * 1 MORE THAN OLD NUM, find diff betwwen new num and temp and continue loop 
 * untill array ends. print diff
 * 
 * for(int i=1;i<arr.length;i++){
 * if(arr[i] <= arr[i-1]{
 * int temp = [arr[i]
 * arr[i] = arr[i-1]+1
 * diif+=arr[i]-temp
 * }
 * }
 * 
 * 
 * 
 */
