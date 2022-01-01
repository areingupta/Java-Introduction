import java.util.Scanner;
import java.lang.Math;

public class prob_3_check_armstrong {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        int q = n;
        int i = 1;
        double counter = 0;
        boolean b = false;

        while (n != 0){
            int rem = n%10;
            counter = counter + 1;
            n = n/10;
        }
        double sum = 0;
        while (m!=0){
            int rem = m%10;
            double power = Math.pow(rem,counter);
            sum = sum + power;
            m=m/10;
        }

        if (sum == q){
            b = true;
            System.out.println(b);
        } else {
            System.out.println(b);
        }
    }
}
