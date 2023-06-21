import java.util.HashSet;

public class NumberOfArithmaticTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diff = 3;
		int ans =0;
		int[] nums = {0,1,4,6,7,10};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num : nums) {
			if(set.contains(num-diff) && set.contains(num-2*diff)) {
				ans++;
			}
			set.add(num);
			System.out.println("num :"+num);
		}
		System.out.println("ans :"+ans);
	}
	
	
	// Java Solution Brut force
	class Solution {
	    public int arithmeticTriplets(int[] nums, int diff) {
	        int n=nums.length;
	        int cnt=0;
	        for(int i=0;i<n;i++)
	            for(int j=i+1;j<n;j++)
	                for(int k=j+1;k<n;k++)
	                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
	                        cnt++;
	        return cnt;
	    }
	}

}









/* Above problem we can solve by using HashSet
 * its given i<j<k, lets take x, y,z
 * if y-diff = x
 * z-2*diff = y
 * 
 * because both number has same diff
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * HashSet 
 * 
 * HashSet does not allow duplicates
 *  because it has built in function to remove duplicates
 *  HashSet is not based on index and its not in order
 * 
 * In hashSet can add remove items 
 * convert to array and get element but it will give random element:
 * HashSet<Integer> h = HashSet<Integer>;
 * Object [] ha = h.toArray();
 * 
 * Iterator:
 * Iterator<Integer> it = h.it();
 * 
 * For each loop
 * e.g String[] cars = {"MacLaren", "BMW"};
 * for(String car:cars){
 * print(car);
 * }
 * 
 *  
 * 
 * 
 * */
