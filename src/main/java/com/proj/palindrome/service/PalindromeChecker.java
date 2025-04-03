package com.proj.palindrome.service;
import java.util.Stack;

public class PalindromeChecker {

   public static Boolean isPalindrome(String palindrome) {
        Stack<Character> stack = new Stack<Character>();
        
        int lastLetter= palindrome.length()-1;
		char[] array = palindrome.toCharArray();
		for(int i = 0; i < palindrome.length(); i++) {
			stack.push(palindrome.charAt(i)); // Pushes each character of palindrome into a stack
		}
		
		for(int k = 0; k < palindrome.length(); k++) { 
			if(array[k] == palindrome.charAt(lastLetter)){ // Checks to see if the first and last match & then continue process till you overlap in the middle of the word
				stack.pop();
				lastLetter--;
			}
	    }
        if(stack.isEmpty() && palindrome.length() != 1){
            return true;
        } else {
            return false;
        }
    }
}
