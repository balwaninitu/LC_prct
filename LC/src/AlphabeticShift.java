
public class AlphabeticShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "crazy";
		 char[] chr = inputString.toCharArray();
		    for(int i=0;i<chr.length;i++){
		    	//System.out.println(chr[1]);
		        if(chr[i] == 'z'){
		            chr[i] = 'a';
		            
		        }else{
		            //a to b to c & so on
		            chr[i]++;
		        }
		        
		    }
		  System.out.println(new String(chr));
	}

}

/*
 * Print the string with alphabetic shift, if it is a then b , if b then c
 * and so on and if its z print a
 * String str = "Zebra"
 * 1. convert string to char array
 * Char[] ch = str.toCharArray();
 * 2.loop around char and increment if its z then a
 * for(int i=0;i<ch.length;i++){
 * if(ch[i] =='z'){
 * ch[i] = 'a'
 * }else{
 * ch[i]++;
 * }
 * 
*/