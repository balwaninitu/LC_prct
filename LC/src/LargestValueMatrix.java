import java.util.Arrays;

public class LargestValueMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid =  {
				{9,9,8,1},
				{5,6,2,6},
				{8,2,6,4},
				{6,2,2,2}

			};
		
		int n = grid.length;
		 int [][] res = new int [n-2][n-2];
		for(int i=0; i<res.length;i++){  //
           for(int j=0; j<res[i].length;j++){
               res[i][j] = getMaxVal(grid,i,j);//res[9][9] =

             System.out.println("j :"+j);

           }
           System.out.println(Arrays.deepToString(res));
		}	
		

	}
	
	public static int getMaxVal(int [][]grid, int row, int col ){
	    System.out.println("row :"+row);
	    System.out.println("col :"+col);
	    int max = Integer.MIN_VALUE;
	    for(int i=row; i<row+3;i++){
	        for(int j=col; j<col+3;j++){
	            max = Math.max(grid[i][j],max);
	        }
	    }
	     System.out.println("max :"+max);
	    return max;
	  
	  }

}

/*
 * EXPLAINATION Initialize the empty array with size n-2 or grid.length-2. i.e.
 * int [][] res = new int [n-2][n-2]; loop the result array elements -> res i.e.
 * loop till i and j till n-2, we are iterating this because we will store the
 * Max element of each quadrant (will discuss later). create a method getMaxVal,
 * take input the values of i and j from the loop and also the original array.
 * we will use this method to the max value from the each quadrant, and has we
 * know by the question the max quadrant value is 3 therefore we keep this mind
 * while iteration i and j till only i+2 and j+2 also while iteration we will
 * calculate the max of each quadrant. after getting the max we will return. max
 * value will be set in the res array.
 */
