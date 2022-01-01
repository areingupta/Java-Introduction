package assignments;

import java.util.Scanner;

public class problem_6_sqrroot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int result = 1;

        while (result<=n){
            i++;
            result=i*i;
        }
        System.out.println(i-1);

    }
}
