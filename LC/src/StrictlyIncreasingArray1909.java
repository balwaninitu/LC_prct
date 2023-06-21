
public class StrictlyIncreasingArray1909 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums = {1,2,10,5,7};
		int[] nums = {2,3,1,2};
		
		boolean removed=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }
            if(removed){
                System.out.println(false); 
                System.out.println("if false "+nums[i]);
            }
            if(i==0||nums[i-1]<nums[i+1]){
                nums[i]=nums[i+1];
                System.out.println("if true "+nums[i]);
            }else{
                nums[i+1]=nums[i];
                System.out.println("else true "+nums[i]);
            }
            removed=true;
        }
        System.out.println(true);
        System.out.println(nums);

	}

}

/*
 * When you see this question, your first approach would be to remove each index
 * i in nums and check whether the array is sorted. If sorted, return true,
 * otherwise revert to the original array and try different index. This can be
 * done in O(n2) .
 * 
 * But we got to think of a better approach in O(n) Here, we can check each
 * pair, whether they are strictly increasing. If they are, then continue with
 * the next iteration. If not, we need to check the condition involving previous
 * element and next element The below step is just for skipping the current
 * element.
 * 
 * IF nums[i-1]<nums[i+1] then nums[i]=nums[i+1]. ELSE nums[i+1]=nums[i];
 * 
 * Meanwhile, we will have one boolean variable removed which will become true
 * once the very first condition is not satisfied. Hope you understood.
 */