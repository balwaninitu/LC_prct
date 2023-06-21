
public class ArrrayMaxConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray = {2, 3, 5, 1, 6};
		
		int k = 2;
		 //System.out.println("inputArray.length-k "+(inputArray.length-k));
		int sum = initializeSum(inputArray,k);
		int max = sum;
		for(int i=1;i<=inputArray.length-k;i++) {
			 //System.out.println("inputArray[i-1] "+inputArray[i-1]);
			 //System.out.println("inputArray[i+k-1] "+inputArray[i+k-1]);
			// System.out.println("k "+k);
			sum = sum - inputArray[i-1] + inputArray[i+k-1];
			//when i=1
			//sum = 5-2+(3+2-1)
			//sum = 5-
			max = Math.max(max, sum);
		}
		
            System.out.println(max);
	}
	
	

	public static int initializeSum(int[] in, int k){
		int sum =0;
		
		for(int i=0; i<k;i++) {
			sum += in[i];
		}
		return sum;
		
	}

}
