
public class ReverseStringInParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "(bar)";
		
		int openIndex = inputString.lastIndexOf("(");
		
		System.out.println("firstIndex :"+openIndex);
		int closeIndex    = inputString.indexOf(")",openIndex);
		System.out.println("lastIndex :"+closeIndex);
		
		while(openIndex != -1) {
			
			String reverseString = new StringBuilder(inputString.substring(openIndex+1,closeIndex)).reverse().toString();
			String first = inputString.substring(0,openIndex);
			String last = inputString.substring(closeIndex+1);
			inputString = first+reverseString+last;
		    openIndex = inputString.lastIndexOf("(");
			closeIndex    = inputString.indexOf(")",openIndex);
			
		}
	     System.out.println("inputString : "+inputString);

	}

}












/*Approach

*1. Find first opening bracket '(' first index
*2. Find closing bracket ')' last index
*3. reverse string between first & last index
*4. recreate input string with
*    -firstpart = begin to first index
*    -reverse string nfrom 1 to 3
*    -lastpart = word from last ind to end
* 5. repeat steps 1-4 untill no brackets left
*
*
*
*
*/