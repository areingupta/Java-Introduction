package advanced_patterns;

import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int m = (2*n)-1;

        while (i <= n){
            int j = (2*i)-1;
            while (j <= m){
                System.out.print(j);
                j=j+2;
            }
            j = 1;
            int t = 1;
            while (j <= i-1){
                System.out.print(t);
                t+=2;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
