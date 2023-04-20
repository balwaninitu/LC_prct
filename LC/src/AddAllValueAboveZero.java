
public class AddAllValueAboveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{0,1,1,2},
				{0,5,0,0},
				{2,0,3,3}
		};
		 int total = 0;
		//run nested loop to check zero value at all places and convert 
		 //values zero which are below zero	in a rows	    
		   for (int i=0; i<matrix.length; i++){
		     for (int j=0; j<matrix[i].length; j++){
		       if (matrix[i][j] == 0) {
		         for (int k=i+1; k<matrix.length; k++){
		           matrix[k][j] = 0;
		         }
		       }
		     }
		   }
		    
		   for (int x=0; x<matrix.length; x++){
		     for (int y=0; y<matrix[x].length; y++){
		       total += matrix[x][y];
		     }
		   }
		    
		   
		

	    System.out.println(total);

	}

}

/*
 * The first for loop (i) goes through the outside array. The second for loop
 * (j) goes through the inside arrays.
 * 
 * Inside the if statement, we want to set every value in the same column to 0
 * if it’s below the current value. We can do this with another loop.
 * 
 * ‘k’ is initially set to i+1 to offset the current value and start in the next row.

We are essentially done now! All we need to do is sum all the values inside of the array. I did this with a variable ‘total’ and a nested for loop.
 */

/*
 * ========Practice============

//make all the values zero below the zero
int[][] matrix = {
		{0,1,1,2},
		{0,5,0,0},
		{2,0,3,3}
};

//run nested loop to check zero value at all places and make below values in row to zero
 int total =0;
for (int i=0;i<matrix.length;i++) {
	 for(int j=0;j<matrix[i].length;j++) {
		 if(matrix[i][j]==0) {
			 for(x=i+1;x<matrix.length;x++) {
				 matrix[x][i]=0;
			 }
		 }
	 }
 }
//here add all remaining value which is not zero practically all above zero
//because below zero are already zero
for(int y=0;y<matrix.length;y++) {
	for(z=0;z<matrix[y.length;z++]) {
		total += matrix[y][z];
	}
}
 */
