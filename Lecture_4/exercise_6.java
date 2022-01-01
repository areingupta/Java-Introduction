package advanced_patterns;

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n){
            int j = 1;
            while (j <= i){
                if (j == i){
                    System.out.print(j);
                } else {
                    System.out.print(j + "+");
                }
                j++;
            }
            sum = sum + i;
            System.out.print("="+sum);
            System.out.println();
            i++;
        }
    }
}
