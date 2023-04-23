import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
		
		int [] arrayLength = new int[inputArray.length];
		
		ArrayList<String> list = new ArrayList<String>();
		    
		//here adding same index of input array and array length
		    for(int i = 0; i < inputArray.length; i++ ){
		        arrayLength[i] = inputArray[i].length();
		    }
		    System.out.println(Arrays.toString(arrayLength)); 
		    Arrays.sort(arrayLength);
		    System.out.println(Arrays.toString(arrayLength)); 
		    
		    //after sort longest string will be at last
		    int maxLength = arrayLength[arrayLength.length-1];
		    System.out.println("maxLength "+maxLength); 
		    //loop and compare if equal to longest string add to list
		    for(int i = 0; i < inputArray.length; i++){
		        if(inputArray[i].length() == maxLength){
		            list.add(inputArray[i]);
		        }
		    }
		    //convert list to array
		    String[] result = list.toArray(new String[list.size()]);
		    
		    System.out.println(Arrays.toString(result)); 

}
}

/*In above, only element with longer string need to be in Array
 * String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
 * 
 * AttayList<String> list = new ArrayList<>;
 * Approach:
 * 1. create new array with len same as given array
 * int[] arr = new int[inputArray.length]
 * 
 * 2.run loop to add len of element in array
 * for(int i=0; i<inputArray.length;i++){
 * arr[i] = inputArray[i].length()
 *}
 * 
 * 3. Once we get array with ele len sort it to get highest len at
 * end
 * Arrays.sort(arr);
 * 
 *declare maxlength as last ele of array
 *int max = arr[arr.length-1];
 * 
 * 4. After sorting add array ele to list in loop, if ele len is same as max
 * for(int i=0;i<arr.length;i++){
 * if(arr[i] == max){
 * list.add(aarr[i]);
 * }
 * }
 * 
 * 5. convert list to array and display result
 * String arr1 = list.toArray(new String[list.size()])
 */
