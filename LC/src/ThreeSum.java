import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/3sum/
public class ThreeSum {

	public static void main(String[] args) {
		 //int[] array = {-1,0,1,2,-1,-4};
		 int[] array = {3,0,-2,-1,1,2};
		 Set<List<Integer>> set = new HashSet<>();
		 Arrays.sort(array);
		
		  for(int i=0;i<array.length-2;i++){
			  // current i is same as previous, it will create duplicate result
			  if(i > 0 && array[i] == array[i-1])
	                continue;
			int j= i+1;//starts at 2nd index of array
			int k=array.length-1;//starts at last index of array
			while(j<k) {
				int sum = array[i]+array[j]+array[k];
				if(sum == 0) {
					set.add(Arrays.asList(array[i],array[j++],array[k--]));
                
				}else if(sum >0) {
					k--;
				}else if(sum<0) {
					j++;
				}
			}
		 }
		 System.out.println(Arrays.toString(set.toArray()));
	}

}
