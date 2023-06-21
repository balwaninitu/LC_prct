import java.util.LinkedList;

public class StringRearrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] inputArray = {"aba", "bbb", "bab"};
		
		LinkedList<String> tries = loadsStrings(inputArray);
		LinkedList<String> matches = new LinkedList<String>();
		matches.offer(tries.poll());
		int len = matches.getFirst().length();
		while(!tries.isEmpty()) {
			int numOfTries = tries.size();
			String first = matches.getFirst();
			String last = matches.getLast();
			for(int t=0; t<numOfTries;t++) {
				String actual = tries.poll();
				if(exactOneDiff(first, actual, len)) {
					matches.addFirst(actual);
					break;
				}else if(exactOneDiff(last,actual,len)) {
					matches.addLast(actual);
					break;
				}else {
					tries.offer(actual);
				}
			}
			if(numOfTries == tries.size());
			System.out.println(false);
		}
		
		System.out.println(true);
	}
	
	public static boolean exactOneDiff(String target, String actual, int len) {
		int diff = 0;
		for(int ch=0; ch<len;ch++) {
			if(target.charAt(ch) != actual.charAt(ch)) diff++;
			
		}
		return diff == 1;
	}
	
	public static LinkedList<String> loadsStrings(String[] in){
		LinkedList<String> temp = new LinkedList<String>();
		for(String str:in) {
			temp.offer(str);
		}
		return temp;
	}

}










/* Approach
 * 
 * Queue -> to store all strings
 * LinkedList<string>
 * 1. initiate LL with first string from queue
 * 2. Go through Queue untill it finds a word with
 * difference from 1 letter with either getfirst or fetlast
 * a. if with getFirst, add it to front of list
 * b. if with getLast, add it to back of list
 * 3. if no match, return false
 * 
 * 
 * 
 *  */
 