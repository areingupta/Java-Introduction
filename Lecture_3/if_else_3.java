package If_else;

import java.util.Scanner;

public class if_else_3 {
    public static void main (String[] args) {
//        int a=50;
//        int b=Integer.MIN_VALUE;
//        if(a/0==b)
//        {
//
//            System.out.println("Hello");
//        }
//        else
//        {
//            System.out.println("Hi");
//        }

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c = str.charAt(0);

        if(Character.isUpperCase(c)){
            System.out.println("1");
        }
        if(Character.isLowerCase(c)){
            System.out.println("0");
        }
        if(!Character.isLetter(c)){
            System.out.println("-1");
        }

    }
}
