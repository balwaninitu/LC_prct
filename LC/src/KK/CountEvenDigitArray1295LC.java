package KK;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class CountEvenDigitArray1295LC {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0};
		int ans = findNumbers(arr);
		System.out.println(ans);
		System.out.println("no. of digit "+digits(0));
		System.out.println("optomized no. of digit "+digits1(1234));

	}
	
	static int findNumbers(int[] nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count++;
				
			}
		}
		return count;
        
    }
	//check if number is even
	static boolean even(int num) {
		int noOfDigit = digits(num);
		
		/*if(noOfDigit % 2 == 0) {
			return true;
		}
		return false;*/
		
		return noOfDigit%2==0;
	}
	
	//count number of digits in a number
	static int digits(int nums) {
		//if number is negative make it positive
		if(nums < 0) {
			nums = nums * -1;
		}
		if(nums == 0) {
			return 1;
		}
		int count = 0;
		while(nums > 0) {
			count++;
			nums = nums/10;
		}
		return count;
	}
	
	//optimized solution
	//shortcut to find number of digits in java
	static int digits1(int nums) {
		if(nums == 0) {
			return 1;
		}
		if(nums < 0) {
			nums = nums * -1;
		}
		return (int)(Math.log10(nums))+1;
	}
	
	

}
