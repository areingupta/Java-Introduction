package while_loop;

import java.util.Scanner;

public class while_exercise_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        int sum = 0;

        while (i<=n){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}
