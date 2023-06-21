
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid = {
				{1, 3, 2, 5, 4, 6, 9, 8, 7},
				{4, 6, 5, 8, 7, 9, 3, 2, 1},
				{7, 9, 8, 2, 1, 3, 6, 5, 4},
				{9, 2, 1, 4, 3, 5, 8, 7, 6},
				{3, 5, 4, 7, 6, 8, 2, 1, 9},
				{6, 8, 7, 1, 9, 2, 5, 4, 3},
				{5, 7, 6, 9, 8, 1, 4, 3, 2},
				{2, 4, 3, 6, 5, 7, 1, 9, 8},
				{8, 1, 9, 3, 2, 4, 7, 6, 5}
		};
		
		for(int i = 0; i < grid.length; i++){
	        for(int j = 0; j < grid[0].length; j++){
	            if(grid[i][j] != '.'){
	                int tmp = grid[i][j];
	                for(int k = j+1; k < grid[0].length; k++){
	                    if(tmp == grid[i][k]){
	                    	 System.out.println( false);
	                    }
	                }
	                for(int l = i+1; l < grid.length; l++){
	                    if(tmp == grid[l][j]){
	                    	 System.out.println( false);
	                    }
	                }
	                int x = 0;
	                int y = 0;
	                if(i < 3){
	                    x = 0;
	                }
	                if(j < 3){
	                    y = 0;
	                }
	                 if(i > 3 && i < 6){
	                    x = 3;
	                }
	                if(j > 3 && j < 6){
	                    y = 3;
	                }
	                 if(i  > 6){
	                    x = 6;
	                }
	                if(j > 6){
	                    y = 6;
	                }
	                int tmp2 = 0;
	                for(int p = x; p < x+3; p++){
	                    for(int g = y; g < y+3; g++){
	                        if(grid[p][g] == tmp){
	                            tmp2++;
	                        }
	                    }
	                }
	                if(tmp2 >= 2){
	                   System.out.println( false);
	                }
	            }
	        }
	    }
		 System.out.println( true);


	}

}
