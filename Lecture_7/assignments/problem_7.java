package assignments;

import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int pre=scan.nextInt();
        int i=1;
        boolean isDec=true;
        int count=0;
        while(i<=n-1) {
            int curr=scan.nextInt();
            if(pre==curr) {
                System.out.println(false);
                return ;
            }
            else if(pre<curr) {
                if(isDec) {
                    count++;
                    isDec=false;
                }

            }else {
                if(!isDec) {
                    System.out.println(false);
                    return ;
                }


            }
            i++;
            pre=curr;
        }
        if(count==1&&isDec==false || count==0 && isDec==true || count==0 && isDec==false) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}