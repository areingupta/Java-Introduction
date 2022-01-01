package assignments;

import javax.swing.*;
import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n!=0){
            int rem = n%10;
            if (rem == 0){
                n=n/10;
                continue;
            }
            if (rem != 0){
                break;
            }
        }
        while (n!=0){
            int rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
    }

}