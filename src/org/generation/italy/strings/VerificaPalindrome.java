package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your word to check if it is palindrome: ");
        String word = scanner.nextLine();
        String inverseWord = "";
        char ch;



        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            inverseWord = ch + inverseWord;
        	}

        if (word.equals(inverseWord)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        	}

        scanner.close();
    }

}