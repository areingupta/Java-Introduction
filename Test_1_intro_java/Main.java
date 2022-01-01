import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n){
            int j = n;
            while (j != 0){
                if (j == i){
                    System.out.print("*");
                    j--;
                    continue;
                }
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
