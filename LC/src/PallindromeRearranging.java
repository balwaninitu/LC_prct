import java.util.HashMap;

public class PallindromeRearranging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "niitnn";
		
		//get frequency of character using map 
		//if odd only one char can be without 1
		//if even all chars should be in pair or even no.
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<inputString.length();i++) {
			Character key = inputString.charAt(i);
			Integer value = map.get(key) == null ? 1 : map.get(key)+1;
			map.put(key,value);
			
		}
		System.out.println(map);
		boolean odd = false;
		//for each loop to count map values
		for(Integer count : map.values()) {
			if(count % 2 != 0) {
				if(odd) {
					System.out.println(false);
				}
				odd = true;
			}
		}
		System.out.println(true);

	}

}
