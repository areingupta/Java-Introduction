package while_loop;

import java.util.Scanner;

public class while_loop_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 0;

        while (i<n){
            System.out.println(i);
            i = i+1;
        }
    }
}
