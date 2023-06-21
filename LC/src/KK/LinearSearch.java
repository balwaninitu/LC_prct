package KK;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Linear search
		 * best case : O(1) - constant
		 * worst case : O(n) - linear
		 */
		int [] arr = {2,4,6,8,10};
		int target =1;
		int ans = linearSearch(arr, target);
		int ans1 = linearSearch2(arr, target);
		boolean ans2 = linearSearch3(arr, target);
		System.out.println("index "+ans); 
		System.out.println("ele "+ans1); 
		System.out.println("boolean "+ans2); 
		

	}
	//search in the array
	//return index if item found , if not found return -1
	static int linearSearch(int[] arr , int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int index=0;index<arr.length;index++) {
			int ele = arr[index];
			if(ele == target) {
				return index;
			}
			
		}
		
		//this line will execute if non of return statement hit above
		//index can not be -1 hence we can return -1 here
		return -1;
		
	}
	
	//return element instead of index
	static int linearSearch2(int[] arr , int target) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		//if returning element can use for each loop
		/*for(int index=0;index<arr.length;index++) {
			int ele = arr[index];
			if(ele == target) {
				return ele;
			}
			
		}*/
		//if returning element can use for each loop
		for(int ele:arr) {
			if(ele == target ) {
				return ele;
			}
		}
		
		//this line will execute if non of return statement hit above
		//instead of -1 return max value because -1 can also be one of the integer
		//return -1;
		return Integer.MAX_VALUE;
		
	}
	
	static boolean linearSearch3(int[] arr , int target) {
		if(arr.length == 0) {
			return false;
		}
		for(int ele:arr) {
			if(ele == target ) {
				return true;
			}
		}
		
		return false;
	}
	

}
