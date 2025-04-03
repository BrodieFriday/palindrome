package com.proj.palindrome.util;
import java.util.Scanner;

public class InputScanner {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserSubmission(String userInput) {
        System.out.println(userInput);
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
