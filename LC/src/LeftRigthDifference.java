import java.util.Arrays;

//https://leetcode.com/problems/left-and-right-sum-differences/
public class LeftRigthDifference {

	public static void main(String[] args) {
		
		int[] nums = {10,4,8,3};
		
		
		int[]ans = leftRigthDifference(nums);
		
		System.out.println(Arrays.toString(ans));
		
	}
public static int[] leftRigthDifference(int[] nums) {
	int rSum=0;
	int n = nums.length;
	for(int num:nums) {
		//find total sum of array
		rSum += num;
	
	}
	int lSum=0;
	int[] ans = new int[n];
	for(int i=0;i<n;i++) {
		//remove current element from rsum 
		rSum -= nums[i];
		//element in new array will be lsum-rsum
		ans[i] = Math.abs(lSum-rSum);
		//lsum initialize with zero, then will be nums[i] in loop
		lSum += nums[i];
		
	}
	return ans;
    }
	

}

/*Approach:
 * 
 * 1. first get sum of all elements
 * 2. then in next loop lsum start with zero
 * 3.rsum will be current element 
 * 4 find out first element of new array by lsum-rsum
 * 5.add next element in lsum 
 * 
 */
