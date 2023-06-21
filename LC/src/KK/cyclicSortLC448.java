package KK;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class cyclicSortLC448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*e.g array=[7,3,2,4,8,2,3,1]
		 * first check element 0 its 7 then swap with correct index which is 6.
		 * then array will be [3,3,2,4,8,2,7,1] and again continue with 3 and swap it with correct index
		 * 
		 */
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(nums);
	}
	
public List<Integer> findDisappearedNumbers(int[] nums) {
	int i=0;
	while(i<nums.length) {
		int correctIndex=nums[i]-1;//if element is 3 its index should be 3
		if(nums[i] != nums[correctIndex]) {
			swap(nums, i, correctIndex);
		}else {
			i++;
		}
	}
	//search for  missing number
	List<Integer> ans = new ArrayList<>();
	for(int index=0; index<nums.length;index++) {
		if(nums[index] != index+1) {
			 ans.add(index+1) ;
		}
	}
	
	//case 2
	return ans;
}
        
   
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
