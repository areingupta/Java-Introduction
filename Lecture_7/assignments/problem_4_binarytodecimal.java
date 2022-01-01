package assignments;

import java.util.Scanner;
import java.lang.Math;

public class problem_4_binarytodecimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec_num = 0;
        int base = 1;

        while (n!=0){
            int rem = n%10;
            int temp = rem*base;
            dec_num = dec_num + temp;
            base=base*2;
            n=n/10;
        }
        System.out.println(dec_num);
    }
}
