import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int[] nums = {-1,2,1,-4};
		int target = 1;
		int closestSum = Integer.MAX_VALUE;
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-2;i++) {
			int j= i+1;
			int k = nums.length-1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if(sum == target) {
					System.out.println("Sum is 3 same as target "+sum);
				}else if(Math.abs(target -sum) < Math.abs(target - closestSum )) {
					closestSum = sum;
				}
				if(sum <= target) {
					j++;
					while(nums[j] == nums[j-1] && j<k) {
						j++;
					}
				}else {
					k--;
				}
			}
		}
		System.out.println("closestSum is "+closestSum);
	}

}

/*
 * Intuition
This question is similar to the 3 Sum Problem with a minute difference. In 3 sum problem we had to find three integers summing upto a specific target. But here its not guaranted that the three numbers will sum upto the given target so we have to find the sum nearest to the target and return that sum.

Approach
The first thing we would do is to sort the array. Then we would loop from 0 to length-2. We would make two pointers as lower and upper.

Thge sum of these three integers will be equal to:

 sum = nums[i] + nums[lower] + nums[upper]
if sum is equal to our target, this would be our best case. So we would return either sum or target since both are equal.

if difference between target and sum is less than difference between target and closestSum, in that case we make our sum as closestSum.

if the target is 8, in that case we will increment the left pointer.
qq.jpg

if the target is 4, in that case we will decrement the right pointer.


And we keep doing so until we find the least difference between target and sum which would be our required closest sum.
 */
 
