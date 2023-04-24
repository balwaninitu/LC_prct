import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cabca";
	//set allows only unique chars and remove duplicates
		Set<Character> set = new HashSet<>();
		
		for(char ch : s.toCharArray()) {
			set.add(ch);
		}
		    
		   System.out.println(set.size());
		   
	}

}

/*written number of uniques char in string if dont count doubles
 * Approach
 * 
 * 1.Add string to set as set allows only unique chars
 * Set<Character> set = new Set<>();
 * for(char ch: s.toCharArray(){
 * set.add(ch)
 * print set size
 * 
 */
