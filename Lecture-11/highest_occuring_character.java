package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class highest_occuring_character {


    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine ();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        char ans = 'a';

        System.out.println(ans);

    }

}
