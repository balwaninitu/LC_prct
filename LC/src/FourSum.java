import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {2,2,2,2,2};
		Set<List<Integer>> list = new HashSet<>();
		Arrays.sort(nums);
		
		int target = 8;
		for(int i=0;i<nums.length-3;i++) {
			for(int j=i+1;j<nums.length-2;j++) {
				int k=j+1;
				int l=nums.length-1;
			while(k<l) {
			//if(!set.contains(nums[i])) {
				long sum = (long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
				if(sum == target) {
					list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
					k++;
					l--;
				}else if(sum < target) {
					k++;
					
				}else {
					l--;
				}
			//}
		}
			}
		}
		System.out.println(Arrays.toString(list.toArray()));


	}

}



