package patterns_1;

import java.util.Scanner;

public class patterns_5_ {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n){
            int j = 4;
            while (j != 0){
                System.out.print(j);  // or could've done the previous way and print n-j+1
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
