/**
 * 
 */
package KK;

/**
 * @author nitub
 *
 */
public class BinarySearchCeilandFloor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * when find ceiling of number means smallest no. greater or equal to target
		 * return start because while loop condition is start<= end
		 * when condition violated start will be greater than end so return start
		 * 
		 * when find out floor of number means return greatest number that is 
		 * smallest or equal to target, in this case return end because start is greater
		 * than end and hence while loop condition violated
		 * 
		 * time complexity is O(log n)
		 */
		
		//sorted ascending array
		int[] nums = {2,12,13,16,18,23,26,29,34};
		int target=39;
		int ansCeil = binaryCeil(nums, target);
		System.out.println("ansCeil "+ansCeil);
		
		int ansFloor = binaryFloor(nums, target);
		System.out.println("ansFloor "+ansFloor);

	}
	
	static int binaryCeil(int [] nums, int target) {
		//if target is greatest in array, compare with last element in array
		//so no number greater return not found
		if(target > nums.length-1) {
			return -1;
		}
		int start=0;
		int end = nums.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid]) {//go right
				end=mid-1;
			}else if(target > nums[mid]){
				start=mid+1;
			}else {
				return mid;
			}
		}
		return start;
		
	}
	
	static int binaryFloor(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target < nums[mid]) {
				end=mid-1;
			}else if(target > nums[mid]) {
				start= mid+1;
			}else {
				return mid;
			}
		}
		return end;
	}

}
