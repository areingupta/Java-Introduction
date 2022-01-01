package keywords;

import java.util.Scanner;

public class break_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int d = 2;
//        boolean prime = false;
//        while (d < n){
//            if ( n % d == 0){
//                prime = true;
//            }
//            d++;
//        }
//        if (prime){
//            System.out.println("Not Prime");
//        } else {
//            System.out.println("Prime");
//        }                                           WITHOUT USING BREAK !!

        int d = 2;
        boolean prime = false;
        while (d < n){
            if ( n % d == 0){
                prime = true;
                break;   // break terminates the loop here, whereas above, it would have continued dividing with other numbers.
            }
            d++;
        }
       if (prime){
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
