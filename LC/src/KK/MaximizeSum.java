package KK;
//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximizeSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int k = 3;
		int sum = maximizeSum(nums,k);
		System.out.println(sum);

	}
	
public static int maximizeSum(int[] nums, int k) {
	
	ArrayList<Integer> list = new ArrayList<>();
	for (Integer i : nums) {
		list.add(i);
	}
	Collections.sort(list);
	int sum=0;
	int len = list.size();
	
	while(k>0) {
		int n = list.get(len-1);
		sum+=n;
		list.remove(len-1);
		list.add(n+1);
		k--;
	}
	 return sum;
	
}    
   

}
