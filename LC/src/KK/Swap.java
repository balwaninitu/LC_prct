package KK;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		int b = 20;
		
		/*
		 * int temp = a;
		 * 
		 * a=b;
		 * 
		 * b= temp;
		 */
		
		System.out.println(a + " " + b);
		
		
		/*
		 * in this case a & b not will get swap because its creating new //object in
		 * the memory, its not changing //In java there is no pass by reference but only
		 * pass by value. swap(a,b) is not swapping a & b in main method
		 * 
		 * but when we change value for array it will change
		 * 
		 * In swap case we are not modifying the primitive int but we are creating new
		 * since in java it will be pass by value & not reference hence it wont change value
		 * but in case of array we are modifying object array
		 * In array object value has been pass by changing the reference variable hence the value get change
		 * 
		 * but in primitive data types values are getting change in function scope only because we 
		 * initializing new int and not assigning to original ref variable
		 * 
		 * in swap function scope of values of num1 and num2 will be in that function only
		 * it wont pass over to the main method
		 * 
		 */
		System.out.println(a + " " + b);
		
		int[] arr = {1,2,3,4};
		changearray(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	static void swap(int a, int b) {
int temp = a;
		
		a=b;
		
		b= temp;
		
	}
	
	static void changearray(int[] nums) {
		
		nums[0] = 99;
		
	}

}
