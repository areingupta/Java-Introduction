package while_loop;

import java.util.Scanner;

public class while_asnmt_5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int temp = 1;
        while (n!=0){
            temp = temp*x;
            n = n - 1;
        }
        System.out.println(temp);
    }
}
