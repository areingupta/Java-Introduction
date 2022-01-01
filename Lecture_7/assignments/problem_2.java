package assignments;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int terms = 1;

        while (terms <= n){
            int term = (3*i)+2;
            if (term % 4 != 0) {
                System.out.print(term+" ");
                terms++;
            }
            i++;
        }
    }
}
