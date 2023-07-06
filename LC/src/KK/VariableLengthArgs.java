package KK;
//
import java.util.Arrays;

public class VariableLengthArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//when we do not know how many arguments are going to pass
		//internally it takes array of that data types int or string
		fun(2,3,4,5,6,8);
		
		//variable length args should always comes at the end
		fun1(2,5,"a","b");

	} 
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
	//different data types can also take
	static void fun1(int a, int b, String ...v) {
		
		System.out.println(Arrays.toString(v));
		
	}

}
