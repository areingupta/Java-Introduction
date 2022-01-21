package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_compression {

    public static String getCompressedString(String str){

        String ans = "";

        int count = 1;

        ans = ans + str.charAt(0);

        for (int i = 1; i < str.length(); i++){

            if (str.charAt(i) == str.charAt(i-1)){
                count = count + 1;
            }

            if (str.charAt(i) != str.charAt(i-1)){
                if (count != 1){
                    ans = ans + count + str.charAt(i);
                } else {
                    ans = ans + str.charAt(i);
                }
                count = 1;
            }

        }
        // for last count (otherwise it was missed since no new character follows to trigger != statement
        if (count > 1){
            ans = ans + count;
        }

        return ans;
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine ();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = string_compression.getCompressedString(str);
        System.out.println(ans);

    }
}
