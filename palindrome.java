import java.util.Stack;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your word: ");
		String palindrome = scanner.nextLine();
		int lastLetter= palindrome.length()-1;
		int j = 0;
		int[] array = new int[palindrome.length()];
		for(int i = 0; i < palindrome.length(); i++) {
			stack.push(palindrome.charAt(i)); // Pushes each character of palindrome into a stack
		}
		
		while(j < palindrome.length()) {
			array[j] = palindrome.charAt(j); // Assigns each character of pal to a cell within an array
			j++;
		}
		
		for(int k = 0; k < palindrome.length(); k++) { 
			if(array[k] == palindrome.charAt(lastLetter)){ // Checks to see if the first and last match & then continue process till you overlap in the middle of the word
				stack.pop();
				lastLetter--;
			}
	    }
		
		System.out.println();
		if(stack.isEmpty()) {
			System.out.println("This is a palindrome!"); // If the stack is empty then it IS a palindrome
		}
		else {
			System.out.println("This is NOT a palindrome");
		}

		
	}

}
