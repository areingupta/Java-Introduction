package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse_each_word {

    public static String reverseEachWord(String str){

        int currentWordStart = 0;

        String ans = "";

        int i = 0;

        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){

                // Reverse current word

                int currentWordEnd = i-1;

                String reversedWord = "";

                for (int j = currentWordStart; j <= currentWordEnd; j++){
                    reversedWord = str.charAt(j) + reversedWord;
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
            reversedWord = str.charAt(j) + reversedWord;
        }
        // add it to final string

        ans = ans + reversedWord;

        return ans;

    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = reverse_each_word.reverseEachWord(str);

        System.out.println(ans);

    }
}
