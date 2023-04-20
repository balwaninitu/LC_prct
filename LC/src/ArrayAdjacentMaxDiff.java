import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAdjacentMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {2, 4, 1, 0};
		ArrayList<Integer> list = new ArrayList<>();
		   int[] minusArray = new int[inputArray.length-1];
		   
		   for(int i=0; i<inputArray.length-1;i++){
			   //math.abs returns value with negation if it is negative
		       int minus = Math.abs(inputArray[i]-inputArray[i+1]);
		       list.add(minus);
		   }
		   
		   for(int i=0;i<minusArray.length;i++){
		       minusArray[i] = list.get(i);
		   }
		   
		   Arrays.sort(minusArray);
		   int result = minusArray[minusArray.length-1];
		   
		   System.out.println(result); 
		   System.out.println(minusArray.length); 

	}

}
