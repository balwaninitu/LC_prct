
public class MaxProductInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputArray = {3,6,-2,-5,7,3};
		
		int a = Integer.MIN_VALUE;
	    int b=Integer.MIN_VALUE;
	    
	    for(int i=0; i<inputArray.length;i++){
	       if(inputArray[i]> a){
	           b=a;
	           a=inputArray[i];
	       }else if(inputArray[i]>b){
	           b= inputArray[i];
	       }
	        
	    }
	    int i = (a)*(b);
	    System.out.println(i+" i");
	   // return (a-1)*(b-1);

	}

}

/*we need to find max product of two element in array
 * int [] inputArray = {3,6,-2,-5,7,3};
 * 
 * Approach:
 * two pointer method, two var will hold max value and at last 
 * multiply them to provide max product ans.
 * 
 * 1. Initialize both var with min value
 * int a = Integer.MIN_VALUE
 * int b = Integer.MIN_VALUE
 * 
 * 2.loop to check if array element is bigger than a 
 * if yes then a will become b and array ele become a, we are swapping here
 * element so that a and be hold two max values after while while loop and if else 
 * condition and at last multiply a & b
 * for(int i=0; i<arr.length;i++){
 * if(arr[i] > a){
 * b = a
 * a= arr[i]
 * }else if(arr[i]>b){
 * b = arr[i]
 * }
 * print a*b
 * 
 * 
 * 
 */
