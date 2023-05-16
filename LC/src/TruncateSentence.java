
public class TruncateSentence {

	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k = 4;
		

		
		//System.out.println(strArray.toString());
		//System.out.println(strArray);
		String str = truncateSentence(s,k);
		System.out.println(str);

	}
	
public static String truncateSentence(String s, int k) {
	StringBuilder res = new StringBuilder();
	int len= s.length(), count =0;
	for(int i=0;i<len;i++) {
		
		if(s.charAt(i) == ' ') {
			count++;
		}
		if(count == k) {
			break;
		}
		res.append(s.charAt(i));
	}
	
	
	
	return res.toString();
        
    }

}
