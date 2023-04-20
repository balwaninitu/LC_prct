import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAdjacentMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {2, 4, 1, 1,7};
		ArrayList<Integer> list = new ArrayList<>();
		   int[] minusArray = new int[inputArray.length-1];
		   
		   for(int i=0; i<inputArray.length-1;i++){
			   //math.abs returns absolute value(3-6=3), no negative sign
		       int minus = Math.abs(inputArray[i]-inputArray[i+1]);
		       list.add(minus);
		   }
		   
		   for(int i=0;i<minusArray.length;i++){
		       minusArray[i] = list.get(i);
		   }
		   
		   Arrays.sort(minusArray);
		   int result = minusArray[minusArray.length-1];
		   
		   System.out.println("result "+result); 
		   System.out.println("minusArray.length "+minusArray.length); 

	}

}

/*In above problem, find out difference of adjacent number
 * then return max diff of adjacent num e.g. if [1,0,3,6] return
 * 3 as max diff bet 3-6 whereas others are small than 3
 * Approach:
 * 1. Initiate list and run loop of array to find diff 
 * among adjacent nums then add list items to array, create one more array 
 * with size less than given array
 * sort array and return last num
 * int[] inputArray = {2, 4, 1, 1,7};
 * List<Integer> list = new List<>;
 * int[] arr = new int[inputArray-1]
 * 
 * 2.loop
 * for(int i=0; i<inputArray.length-1;i==){
 * int num = math.abs(inputArray[i]-inputArray[]i+1)
 * list.add(num)
 * }
 * 
 * 3.run loop to get list items in new array
 * for(int i=0; i<arr.length;i++){
 * arr[i] = list.get(i);
 * }
 *4. sort array
 *Array.sort(arr);
 *int result = arr[arr.length-1];
 * 
 */
