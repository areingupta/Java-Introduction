package problems;

import java.util.Scanner;

public class reverse_string {

    public static String reverseString(String str){

        String reversed = "";

//        for (int i = str.length()-1; i >= 0; i--){      FIRST APPROACH
//            reversed = reversed + str.charAt(i);
//        }

        for (int i = 0; i < str.length(); i++){
            reversed = str.charAt(i) + reversed;
        }

        return reversed;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String newStr = reverseString(str);

        System.out.println(newStr);
    }

}
