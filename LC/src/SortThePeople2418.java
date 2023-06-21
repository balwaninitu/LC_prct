import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople2418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		
		//map names with height arrays elements
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<heights.length;i++) {
			map.put(heights[i], names[i]);
		}
		System.out.println("map :" +map);
		
		//sort height array in ascending order
		System.out.println(" before sort heights :" +Arrays.toString(heights));
		Arrays.sort(heights);
		System.out.println(" after sort heights :" +Arrays.toString(heights));
		
		//create new array of of size same as height array
		//print string array based on map values of sorted array
		String [] ans = new String[heights.length];
		System.out.println(" Array length :" +ans.length);
		for(int i=heights.length-1,j=0; i>=0;i--) {
			ans[j++] = map.get(heights[i]);
			//j++;
			
		}
		System.out.println(" ans :" +Arrays.toString(ans));
	}

}
