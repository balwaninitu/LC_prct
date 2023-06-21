
public class IsvalidIPv4Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "172.16.254.1";
		
		String pattern = "25[0-5]|2[0-4][0-9]| 1[0-9][0-9]|[1-9][0-9]|[0-9]";
		
		String[] ips = inputString.split("\\.");
		if(ips.length != 4)
			System.out.println(false);
		for(String ip : ips) {
			if(!ip.matches(pattern)) ;
			System.out.println(false);
		}
		
		System.out.println(true);
		
	}	

	

}



/* Approach
 * 
 * With the help of regex we can define pattern and
 * compare string with that pattern
 * 
 *  string should be four numbers
 *  
 *  each number should not have leading zeroes
 *  range 0 to 255
 *  
 *  regex
 *  250 to 255,   25[0-5]
 *  200 to 249,   2[0-4][0-9]
 *  100 to 199    1[0-9][0-9]
 *  10 to 99      [1-9][0-9]
 *  0 to 9        [0-9]
 *  */
