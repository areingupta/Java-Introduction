import java.util.Scanner;

public class func_3 {
    public static boolean checkPrime(int n){
        int d = 2;
        while (d<n){
            if (n%d == 0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isPrime = checkPrime(n);
        System.out.println(isPrime);
    }
}
