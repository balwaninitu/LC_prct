package KK;
//
public class Shadowing {
	
	//in shadowing lower level shadow the upper level
	static int x = 90; // this will be shadowed at line 12

	public static void main(String[] args) {
		//shadowing in java is creating same variable in different block scope 
		System.out.println(x);//90
		int x ;//= 40;// the class variable at line 4 shadowed by this
		
		//System.out.println(x); variable hasnt initialized, scope begin when value is initialized
		x=40;
		System.out.println(x);//40
		fun();

	}
	
	static void fun() {
		System.out.println("at fun :"+x);
	}

}
