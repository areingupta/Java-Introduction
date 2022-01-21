import java.util.Scanner;

public class func_2 {

    public static int factorial(int n){
        int ans = 1;
        for (int i=1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial((n-r));

        int result = (num)/((den1)*(den2));
        System.out.println(result);
    }
}
