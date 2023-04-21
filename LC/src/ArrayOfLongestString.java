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
