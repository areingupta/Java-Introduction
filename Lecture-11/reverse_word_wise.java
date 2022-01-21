package problems;

import java.util.Scanner;

public class reverse_word_wise {

    public static String reverseWordWise(String input){

        String reversed = "";
        String ans = "";
        int i = 0;

        // Reverse the string

        for (i = 0; i < input.length(); i++){
            reversed = input.charAt(i) + reversed;
        }

        int currentWordStart = 0;

        for (i = 0; i < reversed.length(); i++){
            if (reversed.charAt(i) == ' '){

                // Reverse current word

                int currentWordEnd = i-1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++){
                    reversedWord = reversed.charAt(j) + reversedWord;
                }

                // add it to final string

                ans = ans + reversedWord + " ";
                currentWordStart = i + 1;
            }
        }

        // To not miss the last word since there's no space after it to execute if statement.

        int currentWordEnd = i-1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++){
            reversedWord = reversed.charAt(j) + reversedWord;
        }
        // add it to final string

        ans = ans + reversedWord;

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverse_word_wise.reverseWordWise(input));
    }
}
