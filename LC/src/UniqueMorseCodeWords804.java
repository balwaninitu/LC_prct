import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] words = { "gin", "zen", "gig", "msg" };

		// create Set since set only accepts unique values
		Set<String> set = new HashSet<>();

		for (String word : words) {
			StringBuilder str = new StringBuilder();
			System.out.println("words w :" + word);
			// charArray converts string to character array
			
			  for(char c:word.toCharArray()) { 
			  str.append(morse[c-'a']);
			  System.out.println("str :"+str); 
			  System.out.println("c :"+c);
			  
			  }
			
			  set.add(str.toString());
			
		}

		System.out.println("set size :" + set.size());
	}

}
