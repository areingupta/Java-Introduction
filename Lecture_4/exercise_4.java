package advanced_patterns;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = n+1;
        int n2 = n;
        int i = 1;

        while (i <= n1){
            System.out.print("*");
            int j = 1;
            while ( j <= i-1){
                System.out.print(j);
                j++;
            }
            j = 1;
            int t = i - 2;
            while ( j <= i - 2){
                System.out.print(t);
                t--;
                j++;
            }
            if (i > 1){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= n){
            System.out.print("*");
            int j = 1;
            while (j <= n - i){
                System.out.print(j);
                j++;
            }
            j = 1;
            int t = (n-i)-1;
            while (j <= (n-i)-1){
                System.out.print(t);
                t--;
                j++;
            }
            if (i < n){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}

// CODE WORKED BUT ONE TEST CASE FAILED
// SO ALTERNATIVELY, WE COULD HAVE MADE FIRST AND LAST STARS AS SEPARATE PRINT STATEMENTS AND DISTRIBUTED N into n and n-1.