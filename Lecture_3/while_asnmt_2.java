package while_loop;

import java.util.Scanner;

public class while_asnmt_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while( i<=10){
            int mult = n*i;
            System.out.println(mult);
            i = i + 1;
        }
        // Passed
    }
}
