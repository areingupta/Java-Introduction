package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_1 {

    public static int countWords(String str){

        int counter = 0;

        if (str == ""){
            return 0;
        } else {

            for (int i = 0; i < str.length(); i++){

                if (str.charAt(i) == ' '){
                    counter += 1;
                }
            }
            return counter+1;

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

        int count = problem_1.countWords(str);
        System.out.println(count);
    }

}
