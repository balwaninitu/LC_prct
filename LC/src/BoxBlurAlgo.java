import java.util.Arrays;

public class BoxBlurAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] image = {
				{7,4,0,1},
				{5,6,2,2},
				{6,10,7,8},
				{1,4,2,0}
		};
		int rows = image.length;
		int cols = image[0].length;
		int [][] blur = new int[rows-2][cols-2];
		for(int r=1;r<rows-1;r++) {
		for(int c=1;c<cols-1;c++) {
			blur[r-1][c-1]= getAvg(image, r,c);
			
		}
		
		}
		
		System.out.println(Arrays.deepToString(blur));

 	}
	
	public static int getAvg(int [][] img, int r, int c) {
		/*
		 * ul -1 -1
		 * um -1 0
		 * ur -1 +1
		 * ml 0 -1
		 * mm 0,0
		 * mr 0 +1
		 * dl +1 -1
		 * dm +1 0
		 * dr +1 +1
		 * 
		 */
		return (img[r-1][c-1] + img[r-1][c]+img[r-1][c+1]+
				img[r][c-1] + img[r][c] + img[r][c+1]+
				img[r+1][c-1] + img[r+1][c] + img[r+1][c+1]
				
				)/9;
				
	}

}

/* Approach 
 * 
 * 1. iterate through each square thats not in the border
 * 2. get average of 3x3 area including square that are on center
 * 3. return image
 * 
 * */
