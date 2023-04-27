import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

/*To, find out a sliding window problem :-
> First thing is, we have given something like an "Array" | OR | "String"
> Second thing is, they are talking about either "subsequence" | OR | "substring"
> And third most thing is, either we have given a
 "window size i.e. k" | OR | we have to "manually find out window size" */

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String	s = "pwwkew";
		int i=0, j=0, max=0;
		Set<Character> set = new HashSet<>();
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
			set.add(s.charAt(j++));
			max = Math.max(max,  set.size());
			
		}else {
			set.remove(s.charAt(i++));
		}
		}
		
		System.out.println(max);
		

	}

}
