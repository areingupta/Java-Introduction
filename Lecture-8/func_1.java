import java.util.Scanner;

public class func_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++){
            num=num*i;
        }
        int den1 = 1;
        for (int i = 1; i <= r; i++){
            den1=den1*i;
        }
        int den2 = 1;
        for (int i = 1; i <= r; i++){   // copying the same code for factorial again & again
            den2=den2*i;
        }
        int ans = (num)/((den1)*(den2));
        System.out.println(ans);
    }
}
