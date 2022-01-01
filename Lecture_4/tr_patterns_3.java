package triangle_patterns;

import java.util.Scanner;

public class tr_patterns_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int t = 1;  // instead of resetting it to i everytime, we give initial value and then let it increase.

        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(t);
                t++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
