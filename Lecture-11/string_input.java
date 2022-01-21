import java.util.Scanner;

public class string_input {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String str;
        // str = s.next();
        str = s.nextLine();

        System.out.println(str + " " + str.length());

    }

}
