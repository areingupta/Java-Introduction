package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class remove_all_occurences {

    public static String removeAllOccurrencesOfChar(String str, char ch) {

        String ans = "";

        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) != ch){
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        char x = br.readLine().charAt(0);

        String ans = remove_all_occurences.removeAllOccurrencesOfChar(str, x);

        System.out.println(ans);

    }

}
