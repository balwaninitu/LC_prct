package KK;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPositionOfEleInArray34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {5,7,7,8,8,10};
		int target = 8;
		int[] ans = searchRange(nums,target);
		System.out.println(Arrays.toString(ans));

	}
	
	static int[] searchRange(int[]nums,int target) {
		int[] ans = {-1,-1};
		ans[0] = search(nums,target,true);
		
		if(ans[0] != -1) {
			ans[1] = search(nums, target,false);
		}
		return ans;
		
	}
	//return index value of target
	static int search(int[]nums,int target, boolean startIndex) {
		int ans = -1;
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid = start +(end-start)/2;
			if(target < nums[mid]) {
				end = mid-1;
			}else if(target > nums[mid]) {
				start = mid+1;
			}else {
				//potential ans found
				ans = mid;
				if(startIndex) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			
		}
		return ans;
		
	}
	
	

}
