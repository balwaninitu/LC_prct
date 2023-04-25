import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[]  nums1 = {1,2};
		int[] nums2 = {3, 4};
		int n = nums1.length+nums2.length;
		
		//create new array
		int[] arr = new int[nums1.length+nums2.length];
		int j=0;
		for(int i=0;i<nums1.length;i++) {
			arr[j] = nums1[i];
			j++;
		}
		for(int i=0;i<nums2.length;i++) {
			arr[j] = nums2[i];
			j++;
		}
		
		System.out.println("arr "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("arr after sort "+Arrays.toString(arr));
		double med;
		if(arr.length%2 != 0) {
			 med = (double)arr[arr.length/2];
		}else {
			med = (double) (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
		}
		
		System.out.println("med "+med);
		
	}
	
	/*Find median of given two arrays.
	 * 
	 * Approach:
	 * 1. initialize new array with size as sum of two arrays
	 * 
	 * 2.loop through two arrayas and add calues to new array
	 * 
	 * 3. once get new arrays sort it
	 * 
	 * 4 after sort, find out median. If array odd then middle ele will be median
	 * 
	 * 5. If array even then sum of two mid ele and divide by 2 will be med.
	 * 
	 * 
	 * 
	 * 
	 */
	 

}
