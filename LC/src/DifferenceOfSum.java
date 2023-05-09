//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/
public class DifferenceOfSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int ans = differenceOfSum(nums);
		System.out.println(ans);

	}
	
public static int differenceOfSum(int[] nums) {
	int sum=0;
	int digit =0;
	int sum1=0;
	int n = nums.length;
	for(int i=0;i<n;i++) {
		// Add the current element to the elementSum variable
		sum +=nums[i];
	}
	for(int i=0;i<n;i++) {
		// // Extract the digits of the current element and add them to the digitSum variable
		while(nums[i]>0) {
			//// Get the last digit of the current number
			digit = nums[i]%10;
			// Add the last digit to the digitSum variable
			sum1 = sum1+digit;
			// Remove the last digit from the current number
			nums[i] = nums[i]/10;
		}
	}
	
      return Math.abs(sum-sum1);  
    }

}
