package KK;
//https://leetcode.com/problems/first-missing-positive/
/*
 * first sort array then find smallest
 * missing positive number
 * always start from 1 then keep on checking
 * ignore negative numbers
 */
public class CyclicSortFirstMissingPositiveLC41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int firstMissingPositive(int[] nums) {
	        int i=0;
			while(i <nums.length) {
				int correctIndex=nums[i]-1;//if element is 3 its index should be 3
				if(nums[i]> 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
					swap(nums, i, correctIndex);
				}else {
					i++;
				}
			}
			//search for first missing number
			for(int index=0; index<nums.length;index++) {
				if(nums[index] != index+1) {
					return index+1;
				}
			}
			
			//case 2
			return nums.length+1;
			
		}
		  void swap(int[] arr, int first, int second) {
			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
		

}
