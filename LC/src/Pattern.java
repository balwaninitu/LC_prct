
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		pattern5(n);
		

	}
	
	public static void pattern1(int n) {
		
		for (int i=0; i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	
public static void pattern5(int n) {
		
		for (int i=0; i<2*n;i++) {
			
			int totalNoOfColumn = i > n ? 2*n-i-1 : i;
			for(int j=0;j<totalNoOfColumn;j++) {
			
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	
public static void pattern17(int n) {
		
		for (int i=1; i<=2*n;i++) {
			int c = i > n ? 2*n-i : i;
			
			for (int space=0; space<n-c;space++) {
				System.out.print("  ");
			}
			for(int j=c;j>=1;j--) {
				System.out.print(j+" ");
				
			}
			for(int j=2;j<=c;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

public static void pattern31(int n) {
	int originalN = n;
	 n= 2*n;
	for (int i=0;i<=n;i++) {
		
		for(int j=0;j<=n;j++) {
			
			int atEveryindex = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
			System.out.print(atEveryindex+" ");
			
		}
		System.out.println();
		
	}
	
}

}
