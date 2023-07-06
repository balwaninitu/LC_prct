package KK;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth1672 {
//
	public static void main(String[] args) {
		int [][]accounts = {{1,2,9},{3,2,2}};
		
		int ans = maximumWealth(accounts);
		System.out.println("ans "+ans);
		int ans1 = maximumWealth1(accounts);
		System.out.println("for each loop ans1 "+ans1);
		

	}
	//solution by me on my own
	static int maximumWealth(int[][] accounts) {
		
		int max =Integer.MIN_VALUE;
		for(int row=0;row<accounts.length;row++) {
			//sum getting zero after every column sum
			int sum = 0;
			for(int col=0;col<accounts[row].length;col++) {
				sum += accounts[row][col];
				
			}
			//passing max value of sum to max variable
			if(sum > max) {
				max = sum;
			}
			
		}
				
        return max;
    }
	
	//for each loop
static int maximumWealth1(int[][] accounts) {
		
		int max =Integer.MIN_VALUE;
		for(int[] row:accounts) {
			//sum getting zero after every column sum
			int sum = 0;
			for(int col:row) {
				sum +=col ;
				
			}
			//passing max value of sum to max variable
			if(sum > max) {
				max = sum;
			}
			
		}
				
        return max;
    }
	

}
