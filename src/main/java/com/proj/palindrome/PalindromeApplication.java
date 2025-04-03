package com.proj.palindrome;

import java.util.Arrays;
import com.proj.palindrome.util.InputScanner;
import com.proj.palindrome.service.PalindromeChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PalindromeApplication {

	public static void main(String[] args) {
		if (Arrays.asList(args).contains("--cli")) {
            SpringApplication.run(PalindromeApplication.class, args)
                    .getBean(PalindromeApplication.class)
                    .runPalindromeCLI();
        } else {
            SpringApplication.run(PalindromeApplication.class, args);
        }
	}

	public void runPalindromeCLI() {
        Boolean continuePrompt = true;
        while(continuePrompt){
            String userSubmission = InputScanner.getUserSubmission("Enter your word: ");
            System.out.println("userSubmission = " + userSubmission);
            if(PalindromeChecker.isPalindrome(userSubmission)){
                System.out.println("This is a palindrome");
            } else {
                System.out.println("This is not a palindrome");
            }
            String tryAgain = InputScanner.getUserSubmission("Press any key to try again");
            if(tryAgain.isEmpty()){
                continuePrompt = false;
                InputScanner.closeScanner();
            }
        }
    }

}
