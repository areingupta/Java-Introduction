package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_all_substrings {

    public static void printSubstrings(String str) {

        for (int i = 0; i < str.length(); i++){

            for (int j = i; j < str.length(); j++){

                System.out.println(str.substring(i,j+1));

            }

        }

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }

        print_all_substrings.printSubstrings(str);

    }

}
