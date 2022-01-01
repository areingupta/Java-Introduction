package while_loop;

import java.util.Scanner;

public class while_loop_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
