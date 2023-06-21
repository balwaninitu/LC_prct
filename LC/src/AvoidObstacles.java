
public class AvoidObstacles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray = {5, 3, 6, 7, 9};
		//starts with 2 because in constraints it starts from more or equal to 2
		int jump = 2;
		
		for(int i=0; i<inputArray.length;i++) {
			if(inputArray[i] % jump  == 0) {
				i= -1;
				jump++;
			}
		}
		  System.out.println(jump);

	}

}

/* Approach 
 * 
 * 1.Start with mod 2
 * 
 * 2.iterate through each val in input array
 * check if val % mod == 0
 * 
 * a. if so, increment
 * b.Start at the beginning of the input array
 * 
 * 3. else check with next val and repeat step 2
 * 4. If no probs at all, return mod as the jump
 * 
 * 
 * 
 * 
 * */
