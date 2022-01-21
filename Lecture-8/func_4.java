import java.util.Scanner;

public class func_4 {
    public static void printNums(int n){
        if (n <= 0){
            return; // since function is void it won't actually return anything but just end the function!
        }
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNums(n);
    }
}
