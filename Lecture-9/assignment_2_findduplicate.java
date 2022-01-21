package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment_2_findduplicate {

    public static int duplicateNumber(int arr[]){

        int duplicate = 0;

        for (int i = 0; i < arr.length; i++){
            int t = arr[i];
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++){
                if (j == i){
                    continue;
                }

                if (t == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate){
                duplicate = t;
            }
        }
        return duplicate;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(assignment_2_findduplicate.duplicateNumber(input));

            t -= 1;
        }
    }
}
