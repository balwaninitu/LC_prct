import java.util.Arrays;

public class AlternationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {60, 60, 60, 45, 70,90};
		 int[] t1 = new int[a.length];
		    int[] t2 = new int[a.length];
		  
		    int sum1 = 0;
		    int sum2=0;
		    
		    for(int i=0; i<a.length;i++){
		       if(i%2 == 0){
		           t1[i] = a[i];
		       }else{
		           t2[i] = a[i];
		       }
		    }
		    
		    System.out.println(Arrays.toString(t1));
		    System.out.println(Arrays.toString(t2));
		    
		    for(int i=0;i<t1.length;i++) {
		    	sum1 += t1[i];
		    	
		    }
		    for(int i=0;i<t2.length;i++) {
		    	sum2 += t2[i];
		    	
		    }
		    
		    System.out.println("sum1 :"+sum1);
		    System.out.println("sum2 :"+sum2);
		    
		    int[] sum = {sum1,sum2};
		    System.out.println(Arrays.toString(sum));

	}

}

/*
 * alternate sum can be achieve by checking modulus of int i
 * 1. create two array of size of given array
 * int [] a = {60, 60, 60, 45, 70,90};
 * int [] arr1 = new[a.length]
 * int [] arr2 = new[a.length]
 * 
 * 2. initiate two variables of sum
 * int sum1=0
 * int sum2=0
 * 
 * 3.run loop with modulus i which is (0,1,2,3,4 etc in array) which add
 * alternate number in two arrays
 * for(int i=0;i<a.length;i++){
 * if(i%2 ==0){
 * arr1[i] = a[i]
 * }else{
 * arr2[i] = a[i]
 * 
 * 4. Once two arrays are ready run loop through each array to get sum
 * for(int i=0;i<arr1.length;i++){
 * sum1 += arr1[i]
 * 
 * for(int i=0;i<arr2.length;i++){
 * sum2 += arr2[i]
 * 
 * 5. add these sum values to array
 * int[] sum = new {sum1,sum2}
 * 
 * 
 * */
