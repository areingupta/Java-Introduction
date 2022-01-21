import java.util.Scanner;
public class problem_2_func {
    public static boolean checkMember(int n){
        boolean isFib = false;
        int f1 = 1, f2 = 1, f3 = 0;
        if (n == 0 || n==1){
            isFib = true;
        }
        else {
            while (f3<n){
                f3 = f1 + f2;
                f2 = f1;
                f1 = f3;
            }
            if (f3 == n){
                isFib = true;
            }
        }
        return isFib;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(problem_2_func.checkMember(n));
    }

}
