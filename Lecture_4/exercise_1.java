package advanced_patterns;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n){
            int spaces = 1;
            while (spaces <= n-i){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= i-1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
