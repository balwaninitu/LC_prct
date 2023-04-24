import java.util.ArrayList;

public class CommonCharsInTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aabcc";
		String s2="adcaa";
		
		
		ArrayList<Character> list = new ArrayList<>();
        char c;
        int pairs = 0;

        //add s1 char to list
        for(char i : s1.toCharArray()) {
            list.add(i);
        };
        System.out.println("list :"+list); 
//loop through string 2 compare char with list char if matched remove that char from list & increase pairs
        for(int i = 0; i < s2.length(); i++){
            c = s2.toCharArray()[i];
            if(list.contains(c)) {
                list.remove(list.indexOf(c));
                pairs++;
            }
        }
        System.out.println("list after :"+list); 

      
		  
		    System.out.println("pairs :"+pairs); 

	}

}

/*check common chars in teo string and if same return that same no. 
 * if two same chars return two resp.
 * String s1="aabcc";
   String s2="adcaa";
   Char c;
   int nums;
 * Approach:
 * 
 * 1.Convert both string to list
 * ArrayList<Character> list = new ArrayList<>();
 * for(char i:s1.toCharArray(){
 * list.add(i)
 * }
 * 
 * 2. loop to other list of string and check if same char
 * available if yes remove index from list and increment variable
 * at last return pairs var which will give same no. of char available in two string
 * for(int i=0;i<s2.length;i++){
 * c=s2.toCharArray()[i]
 * if(list.contains(c){
 * list.remove(list.indexof(c)
 * nums++;
 * 
 * 
 * 
 */
