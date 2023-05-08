import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,1,2,3,3};
		
		int ans = removeDuplicates(nums);
		System.out.println(ans);
	}
	
	public static int removeDuplicates(int[] nums) {
		int index =1;
		int count =0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				count++;
			}else {
				count=0;
			}
			if(count <=1) {
				System.out.println("b4 index "+nums[index]);
				System.out.println("b4 i "+nums[i]);
				nums[index] = nums[i];
				System.out.println("aft index "+nums[index]);
				System.out.println("aft i "+nums[i]);
				index++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return index;

}
}