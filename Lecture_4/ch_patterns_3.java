package character_patterns;

import java.util.Scanner;

public class ch_patterns_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n){
            int j = 1;
            char st = (char)('A'+i-1);
            while (j <= i){
                System.out.print(st);
                st++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
