package KK;

public class SpaceAndTimeComplexity {
	
	/*Time complexity is not equal to time taken, it is a function
	 * that tell us how much time taken based on size of data grows.
	 * It gives us relationship between how time grows as the input grows.
	 * 
	 * Linear search grows in n and binary search grows in log N.
	 * 
	 * Things to consider about complexity:
	 * 1. Always look for worst case complexity
	 * 2. Always look at complexity for large data
	 * 3.We ignore constant because: 
	 *  a. Even two value of actual time is differ they are all growing linerly.
	 *  b. we dont care about actual time but care about relationship between time 
	 *  as data grows.
	 *  c.always ignore less dominating terms.
	 *  O(1) < O(log N)< O (N) < O(2(powerN)
	 *  
	 *  Mathematical eq to prove Big O:
	 *  
	 *  Big(O):=> Gives the upper bound of case , it may be less but never exceed
	 *  the upper bound.
	 *  f(N) = O(g(N))
	 *  limit N -> infinity(look for large data)
	 *  f(N)/g(N) < infinity
	 *
	 *  Big Omega: Opposite of Big O -> lower bound
	 *  
	 *  limit n -> infinity f(N)/g(N) > 0
	 *  
	 *  Q: If we have upper bound & lower bound as N2(n to the power)
	 *  =O(n2) and omega(N2)
	 *  
	 *  Theta Notation: combining both
	 *  
	 *  0 < lim n-> infinity   f(N)/g(N) < infinity
	 *  
	 *  little O notation: It gives also upper bound,but its not strict but loose
	 *  e.g Big O :             little o
	 *  f = O(g)                f=o(g)
	 *  f <= g                  f<g (strictly slower)
	 *  
	 *  little omega: loosely lower bound 
	 *  
	 *  Big omega                   little omega
	 *  f2 omega(g)                 f = w(g)
	 *  f >= g                      f > g                      
	 *  maths: lim n-> infinity  f(N)/g(N) = infinity
	 *  
	 *  
	 *  Space Complexity=Includes Auxiliary space(extra space or temp space
	 *  used by algorithm)and space used by input.
	 *  Merge sort uses O(n) auxiliary space, 
	 *  Insertion sort and Heap sort use O(1) auxiliary space.
	 *  Space complexity of all these sorting algo is O(n).
	 *  
	 *  Space complexity is always input space + Auxiliary space
	 *  and during space complexity we always talk about Auxiliary space
	 *  Space complexity = height of the tree
	 *  
	 *  Types of recursions:
	 *  1. Linear                         2. Divide & conquer
	 *  F(N) = F(N-1)+F(N-2)              F(N) = F(N/2) + O(1)
	 *  
	 *  
	 *  how to solve to get complexity:
	 *  Divide and conquer recurrence:
	 *  1. Plug and chug: F(N) = F(N/2) + c
	 *  2. Masters theorem
	 *  3. Akra Bazzi(1996)
	 *  
	 *  Akra Bazzi:
	 *  
	 *  Linear recurrence:
	 *  f(n-1)+F(n-2)
	 *  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
