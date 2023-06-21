package KK;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Nitu";
		char target = 'u';
		System.out.println("for loop "+search(name, target));
		System.out.println("for each "+search(name, target));
		

	}
	
	static boolean search(String name, char target) {
		
		for(int i=0;i<name.length();i++) {
			if(target == name.charAt(i)) {
				return true;
			}
			
		}
		return false;
		
	}
	
	//can do for each as well
static boolean search1(String name, char target) {
		
		for(char i:name.toCharArray()) {
			if(i == target) {
				return true;
			}
			
		}
		return false;
		
	}

}
