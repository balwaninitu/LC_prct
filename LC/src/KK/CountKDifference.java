package KK;

public class CountKDifference {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,4};
		int k = 2;
		int diff = countKDifference(nums, k);
		System.out.println(diff);

	}
	
public static int countKDifference(int[] nums, int k) {
       int diff =0;
       for (int i = 0; i < nums.length; i++) {
    	   for(int j=i+1;j<nums.length;j++) {
    		   if(Math.abs(nums[i]-nums[j]) == k) {
    			   diff++;
    		   }
    	   }
		
	}
       return diff;
    }

}
