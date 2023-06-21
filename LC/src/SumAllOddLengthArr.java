
public class SumAllOddLengthArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,2,5,3};
		
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			 // System.out.println("arr.length :"+arr.length);
			//find out how many times index takes part in all subarrays
			//int allCount = (arr.length -1) * (i+1);
			int endinghere = i+1;
			int startingHere =  (arr.length -i);
			int totalSubArrays = endinghere * startingHere;
			int oddSubArrays = totalSubArrays/2;
			if(totalSubArrays % 2 == 1) {
				oddSubArrays++;
			}
			 
		  sum += oddSubArrays * arr[i];
			
			
		}
            System.out.println("sum :"+sum);
            
	}

}

/*
 * approach is to look how many times each number appear in odd sub arrays and
 * then multiply that number e.g odd subarrays 1 3 5 1 142 14253 4 425 2 253 5 3
 * 
 * 
 * num 						1 	4 	2 	5 	3 
 * times 					3 	4 	5 	4 	3 
 * total(multiply) 			3 	16 	10 	20 	9
 * total subarrays can be found out by how many total subarrays starts and how many total ends
 * and multiply them
 * starts = n-i; where n is length and i is index
 * ends = i+1
 * total = strats* ends
 * odd arrays can be found by total/2+1(e.g if total 5/2 = 2 (round)+1 = 3
 */