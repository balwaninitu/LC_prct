package KK;
//
public class Recursion {
	
	/*-when function is not finish execution, it will stay in stack
	 * -when function finishes executing, it is removed from stack and 
	 * restored to where that functions was called.
	 * - the function will return the value where it is being called.
	 * 
	 * Recursion calling one function in another function
	 * all functions has same body e.g. input parameter and output
	 * function that call itself is recursion
	 * 
	 * 
	 * 
	 * Steps to understand recursion
	 * 1. when a function get call again, every function takes memory separately
	 * 2. when there is no base condition for recursion
	 * 3. function will get call and take memory in stacks
	 * 4. at one time, computer memory will get full & will give stack 
	 * overflow error
	 * 
	 * why recursion?
	 * -It helps in solving bigger complex problem in a simple way
	 * - can convert recursion solutions into iterations and vice versa
	 * - space complexity is not constant because of recursive calls
	 * - it helps us to break down bigger problems into smaller 
	 * 
	 * Visualising recursions:recursion tree where one calls other and 
	 * then get remove from stacks one by one
	 * 
	 * Fibonacci numbers:(sum of last two numbers)
	 * Fibo(n)= fibo(n-1)+fibo(n-2)
	 * 
	 */

	public static void main(String[] args) {
		// write a function  that prints hello world
		//message();
		printRecursion(1);
	}

	static void message() {
		System.out.println("hello world");
		message1();
		print(1);
	}
	static void message1() {
		System.out.println("hello world");
	}
	
	//numbers example
	//print first five numbers
	static void print(int n) {
		System.out.println(n);
		print2(2);
		
		
	}
	static void print2(int n) {
		System.out.println(n);
		
	}
	
	//since all function calling same. call recursion function
	static void printRecursion(int n) {
		//base condition
		if(n>5) {
			return;
		}
		System.out.println(n);
		//this is tail recursion
		printRecursion(n+1);
		
	}
}
