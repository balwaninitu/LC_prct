package KK;

public class ArmStrongNumber3digit {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //armsstrong number is the one if we do cube of each num and sum them it will
		 * give same num 
		 * //e.g 153 1(cube,3)+5(cube,3)+3(cube,3)=1+125+27=153
		 */	
		
		boolean ans = isArmstrong(15);
		System.out.println(ans);
		
		for(int i=100; i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.println("3 digit armstrong num :"+i + " ");
			}
		}
	}
	
	static boolean isArmstrong(int n) {
	int original = n;	
	int sum = 0;
	
	while(n >0) {
		int rem = n% 10;
		n= n/10;
		//sum = sum + rem*rem*rem;
		sum += rem*rem*rem;
		
		
	}
	return sum == original;
	//if(sum == original) {
		//return true;
	//}else {
		//return false;
	//}
		
	}

}
