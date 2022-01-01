package while_loop;

import java.util.Scanner;

public class while_exercise_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int st = s.nextInt();
        int e = s.nextInt();
        int w = s.nextInt();
        int i = st;
        while(i<=e){
            int cel = (int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+cel);
            i = i + w;
        }

    }
}
