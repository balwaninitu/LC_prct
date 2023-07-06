package KK;
//
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,7,89,2,3,5};
		reverse(arr);
		
		
		System.out.println(Arrays.toString(arr));

	}
	//two pointers method
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		/*take two pointers start and end
		 * swap start and end then increment start and decrement end 
		 * loop will end when end is greater than start*/
		while(start < end) {
			swap(arr,start, end);
			start++;
			end--;
			
		}
	}
	
	static void swap(int[] arr,int start , int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
				
	}

}
