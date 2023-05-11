//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class ArrayStringsAreEqual {

	public static void main(String[] args) {
		
		String[] word1 = {"abc", "d", "defg"};
		String[] word2 = {"abcddefg"};
		Boolean ans = arrayStringsAreEqual(word1, word2);
		System.out.println(ans);

	}

public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	//StringBuffer sb1 = new StringBuffer();
	//StringBuffer sb2 = new StringBuffer();
	String s1 = "";
	String s2 = "";
	boolean ans=false;
	for(int i=0;i<word1.length;i++) {
		//sb1.append(word1[i]);
		s1 += word1[i];
	}
	for(int i=0;i<word2.length;i++) {
		//sb2.append(word2[i]);
		s2 += word2[i];
	}
	/*String str1 = sb1.toString().trim();
	String str2 = sb2.toString().trim();
	if(s1.equals(s2) ) {
		ans = true;
	} else{
		ans = false;
		
	}*/
	
	//return ans;
	return s1.equals(s2);
        
    }
}
