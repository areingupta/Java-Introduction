package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class removeConsDuplicates {

    public static String removeConsecutiveDuplicates(String str){

        String withoutDuplicates = "";

        withoutDuplicates = withoutDuplicates + str.charAt(0);

        char lastStored = str.charAt(0);

        for (int i = 1; i < str.length(); i++){

            if (str.charAt(i) != lastStored){
                withoutDuplicates = withoutDuplicates + str.charAt(i);
                lastStored = str.charAt(i);
            }
        }

        return withoutDuplicates;
    }

    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim ();
        } else {
            str = "";
        }

        String ans = removeConsDuplicates.removeConsecutiveDuplicates(str);

        System.out.println(ans);

    }
}
