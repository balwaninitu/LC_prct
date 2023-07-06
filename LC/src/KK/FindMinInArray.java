package KK;
//
public class FindMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,-16,-8,4,2,0};
		
		System.out.println(min(arr));

	}
	
	static int min(int[] arr) {
		int ans=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < ans) {
				ans = arr[i];
			}
			
		}
		return ans;
	}

}
