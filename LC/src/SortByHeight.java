import java.util.Arrays;

public class SortByHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		 System.out.println(Arrays.toString(a));
		
		int first = 0;
		int last = a.length-1;
		
		while(first<last) {
   			if(a[first] == -1) {
				first++;
			}else if(a[last] == -1) {
				last--;
				
			}else {
  				sorting(a, first, last);
				first++;
			}
		}
          System.out.println(Arrays.toString(a));
	}
	


private static void sorting(int []a, int first, int last) {
	
      	for(int i=last;i>=first;i--) {
		if(a[i] != -1 && a[i] < a[first]) {
			swap(a, i,first);
			
		}
	}
}

private static void swap(int[]a, int p1,int p2) {
	int temp = a[p1];
	a[p1] = a[p2];
	a[p2] = temp;
	
}
}




	
	
	
	
	

