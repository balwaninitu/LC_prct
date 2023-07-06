package KK;
//
/*In fibonacci return statement provide fibo (n-1) +fibo(n-2)
 * here its return addition of both numbers after it get ans
 * this not tail recursion
 * 
 * steps to understand problem:
 * 1.Identify if you can break down problem with smaller problems
 * 2. write recurrence relation if needed
 * 3.Draw recursive tree
 * 4.about the tree:
 *  a. see flow of functions, how they are getting in stack
 *  b. identify and focus on left tree calls and right tree calls
 *  e.g in fibo, fibo(n-1) will get to call first than fibo(n-2) beacuse its
 *  written first
 *  
 *   
 *  
 *  Entire Left tree will call untill end then only right tree will call
 *  and once all left side left tree complete then only right side of 
 *  left tree get call
 *  
 *  there are 3 variables in fibo func:
 *  1.Argument(variable here go in next function call e.g start and end pointer)
 *  variable which we need for future can go in arguments and variables like middle
 *  element in binary search can go in body because we dont need for future
 *  2.Return Typer
 *  3.Body of function
 *  
 *  Binary search with recursion:
 *  1. comparing: constant time 
 *  2. dividing in two half
 *  
 * recurrence relation: F(N) = O(1)(comparison) + F(N/2)(dividing in half)
 *   
 *   Types of recurrence relation
 *   1. Linear recurrence relation - Fibo
 *   2. Divide and conquer recurrence relation - Binary search
 *   (reduced by factor)
 *   search space get reduced fast in divide and conquer compare to 
 *   linear rec. relation
 *  
 *  
 * 
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		//System.out.println(fibo(20));
		System.out.println(fiboFormula(50));
		
		for(int i=0;i<11;i++) {
			System.out.println(fiboFormula(i));
		}

	}
	
	static int fibo(int n) {
		if(n< 2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	//one line formula to find fibo
	static int fiboFormula(int n) {
		//below formula is to find out time complexity 
		// (int)(Math.pow(((1 + Math.sqrt(5))/2),n));
		//return (int)((Math.pow(((1+Math.sqrt(5))/2),n)- Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5));
		//remove less dominating
		return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
		
	} 

}
