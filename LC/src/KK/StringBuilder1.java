package KK;
//
public class StringBuilder1 {
	/*
	 * In string builder only one object is made and changes
	 * done to that object
	 * e.g. if we are adding a-z string in loop it will add all at once instead of adding one by one
	 * It a separate , it is mutable while strings are immutable
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			StringBuilder build = new StringBuilder();
			for(int i=0; i<26;i++) {
				char ch = (char)('a'+i);
				build.append(ch);
			}
			System.out.println(build.toString());
			build.deleteCharAt(0);
			System.out.println(build.toString());

		}


	}


