package If_else;

import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a>=b && a>=c){
            System.out.println("a is greatest");
        } else {
            if(b>=a && b>=c){
                System.out.println("b is greatest");
            } else {
                System.out.println("c is greatest");
            }
        }
    }
}
