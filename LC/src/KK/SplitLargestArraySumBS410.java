package KK;
////
public class SplitLargestArraySumBS410 {
	//https://leetcode.com/problems/split-array-largest-sum/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * here need to return minimum sum of sub array
 * take all possible sub array take max sum of subarray
 * take min sum from all those sum
 * 
 */
		
		int[] nums = {7,2,5,10,8};
		int m = 2;
		System.out.println(splitArray(nums,m));
	}
	
	public static int splitArray(int[] nums, int m) {
		int start=0;
		int end=0;
		for(int i=0; i< nums.length;i++) {
			//in the end of the loop will contain max
			start=Math.max(start, nums[i]);
			end += nums[i];
		}
		//binary search
		while(start<end) {
			//try for potential ans
			int mid = start + (end-start)/2;
			
			//calculate how many pieces you can divide with this max sum
			int sum=0;
			int pieces=1;
			for(int num :nums) {
				if(sum+num>mid) {
					//you can not add this in sunarray, make new one
					//if sum exceed in one subarray , add in another subarray
					sum=num;
					pieces++;
				}else {
					sum+=num;
				}
			}
			
			if(pieces > m) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return end;//here start = end
	}

}
