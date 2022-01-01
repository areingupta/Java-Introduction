package assignments;

import java.util.Scanner;

public class problem_5_decimaltobinary {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long bin_num = 0;
        long place = 1;

        while (n!=0){
            int rem = n%2;
            bin_num = bin_num + (rem*place);
            place*=10;
            n/=2;
        }
        System.out.println(bin_num);
    }
}
