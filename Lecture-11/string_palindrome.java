package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// A STRING THAT IS SAME FROM START AND LAST.
// 1) FIND REVERSE AND CHECK IF EQUAL
// 2) WORK ON SAME STRING WITH POINTERS FROM START AND END TILL THEY CROSS

public class string_palindrome {

    public static boolean isPalindrome(String str){

        int i = 0; int j = str.length()-1;
        boolean check = true;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                check = false;
                return check;
            }
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
        }
        return check;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }

        boolean ans = string_palindrome.isPalindrome(str);
        System.out.println(ans);
    }

}
