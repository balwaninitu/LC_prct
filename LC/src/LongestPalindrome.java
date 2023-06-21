//https://leetcode.com/problems/longest-palindromic-substring/

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "bab";
		/*expand from center algo - for pallindromic ques
		 * e.g.acvghgvpbab (two pallindromic strings, vghgv and bab)
		 * 1. Start from center e.g (g) and check other two chars(v, h) if they are 
		 * not same then g is not center of pallindromic string.
		 * 2. check h , there are same chars(which is g) on both side of h, hence h
		 * is center of pallindromic string but now we need to find out how big is string
		 * 3. to find how big is substring expand from center
		 * 
		 * Approach:
		 * 1.start with a, there is no any chars at left of a then got to c
		 * but no same char and when we reach to h then we found center
		 * 
		 * 2.once we reach save the length of h (which is 5, vghgv) and if we find more pallindrome
		 * substrings then just return max len
		 * 
		 * 3. go ahead then we get a, it is also center where two chars
		 * from both side same expand and save len(which is 3, bab)
		 * 
		 * 4. edge cases:(e.g baab) here whole string is pallindrome but with
		 * center expand approach we wont find same chars, bacause we are considering
		 * one char as center, to resolve this we will get two variable in center if both are same
		 * then we expand them
		 */
		int start=0,end=0;
		//O(n^2) SC O(1)
		for(int i=0;i<s.length();i++) {
			//we will get index of this and at last since we need to 
			//return string we will cut the string from that index
			//String s = "babad";
			//b a a b
			//in below case center are same, hence expand from both(i,i+1)
			int len1 = expandFromCenter(s,i,i+1);
			//here one center so expand from one(i)
			int len2 = expandFromCenter(s,i,i);
			int len = Math.max(len1, len2);
			if(end-start<len) {
				/*when you take center; from there you need to move 
				 * one point to left and other to right from center
				 */
				
				start =i-(len-1)/2;//go to left side, len-1 will be more accurate
				end=i+len/2;//go to right side
				System.out.println("start :"+start);
				System.out.println("end :"+end);
			}
		}
		System.out.println(s.substring(start,end+1));
		
	}
	
	public static int expandFromCenter(String s, int i,int j) {
		/*dont go out of bound hence while loop, untill left side 
		 * more than 0 and right side less than length of string
		 * loop will continue until i and j are same, if condition 
		 * fulfilled decrease i and increase j
		 * TC(time complexity)-O(n)
		 */
		while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
			i--;
			j++;
			System.out.println("start i :"+i);
			//System.out.println("s.charAt(i) :"+s.charAt(i));
			//System.out.println("end j :"+j);
			//System.out.println("s.charAt(j) :"+s.charAt(j));
			//int var = j-i-1;
			//System.out.println("j-i-1 :"+var);
		}
		return j-i-1;
	}
	
	//String s = "babad";
}
