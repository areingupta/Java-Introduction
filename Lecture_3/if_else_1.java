package If_else;

import java.util.Scanner;

public class if_else_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        if (n%2 == 0){
//            System.out.println("Even");
//        } else {
//           System.out.println("Odd");
//        }

        // ALSO POSSIBLE LIKE THIS
        if (n%2 == 0){
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
