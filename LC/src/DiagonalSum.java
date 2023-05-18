
public class DiagonalSum {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
		              {4,5,6},
		              {7,8,9}};
	int sum = diagonalSum(mat);
	System.out.println(sum);

	}
public static int diagonalSum(int[][] mat) {
	int sum =0;
	int n = mat.length;
	for(int i=0;i<n;i++) {
		//sum of left side and right side diagonal,  // primary diagonal
		sum += mat[i][i];
		//neglect the central element
		if(i != n-i-1) {
			//secondary diagonal
			sum += mat[i][n-i-1];
		}

	}
	return sum;

}    
    
	

}
