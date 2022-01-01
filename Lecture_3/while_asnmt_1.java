package while_loop;

import java.util.Scanner;

public class while_asnmt_1 {
    public static void main(String[] args){

//        Scanner s = new Scanner(System.in);
//        int basic = s.nextInt();
//        char G = s.next().toUpperCase().charAt(0);
//        double hra = (20.0/100)*basic;
//        double da = (50.0/100)*basic;
//        double pf = (11.0/100)*basic;
//        int allow;
//        if (G == 'A'){
//            allow = 1700;
//        } else if (G == 'B'){
//            allow = 1500;
//        } else {
//            allow = 1300;
//        }
//
//        int totalSalary = (int)(basic + hra + da +allow - pf);
//        System.out.println(totalSalary);

        // 2 Test Cases Failed


        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char G = s.next().toUpperCase().charAt(0);
        double hra = (20.0/100)*basic;
        double da = (50.0/100)*basic;
        double pf = (11.0/100)*basic;
        int allow;
        if (G == 'A'){
            allow = 1700;
        } else if (G == 'B'){
            allow = 1500;
        } else {
            allow = 1300;
        }

        double totalSalary = (basic + hra + da +allow - pf);
        int ts = (int) Math.round(totalSalary);

        System.out.println(ts);

        // Passed
    }
}
