
public class LuckyTicketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 239017;
		String s = n+"";
		int sum = 0;
		
		System.out.println("string :"+s);
	
		
		int size = s.length();
		System.out.println("size :"+size);
		System.out.println("size half :"+size/2);
		System.out.println(size);
		//getting char value of number for first half and second half
		//in sum substracting both values & at last if both halves same sum will be zero
		//returning sum == 0 if true it will return true else false
		for(int i=0; i<size/2;i++) {
			int first = s.charAt(i);
			//getting last number in size -i to offset i value
			//The String class internally uses a char[] array to store the characters. 
			int second = s.charAt(size-i-1);
			System.out.println(s.charAt(size-i-1));
			System.out.println(first);
			System.out.println(second);
			sum +=first-second;
		}
		System.out.println("sum :"+sum);
		
	}

}
