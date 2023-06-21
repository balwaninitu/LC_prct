import java.util.Arrays;

public class Minesweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean [][] matrix = {
				{true, false, false},
				{false, true, false},
				{false, false, false}
		};
		
		int rws = matrix.length;
		int cls=matrix[0].length;
		int [][] mMatrix = new int[rws][cls];
		for(int r=0;r<rws;r++) {
			for(int c=0;c<cls;c++) {
				mMatrix[r][c]=check(matrix, r,c);
			}
		}
		System.out.println(Arrays.deepToString(mMatrix));

	}
	
	public static int check(boolean[][] mat, int rw, int cl) {
		int mines = 0;
		int u= rw-1>= 0 ? rw-1 : 0;
		int d = rw +1 <= mat.length -1 ? rw+1 : mat.length -1;
		int l = cl-1 >=0 ? cl -1 :0;
		int r = cl +1 <=mat[0].length -1 ? cl+1 : mat[0].length -1;
		for(int i=u;i<=d;i++) {
			for(int j=l; j<=r; j++) {
				if(mat[i][j] && (!(rw == i && cl == j))) {
					mines++;
				}
			}
		}
		return mines;
		
	}

}









/* Approach 
 * 
 * Iterate through each sq
 * count the neighbours that have mine
 * 
 * input value of neighbour mines
 * go to next square
 * 
 * */
 