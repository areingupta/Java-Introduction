package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment_5_tripletsum {

    public static int findTriplet(int arr[], int x){

        int counter = 0;

        for (int i = 0; i < arr.length; i++){

            int j = i;

            for (j = i; j < arr.length; j++){
                if (i == j){
                    continue;
                }
                int sum = arr[i]+arr[j];
                int k = j;

                for (k = j; k < arr.length; k++){
                    if (k == j){
                        continue;
                    }
                    if (arr[k] == x-sum){
                        counter++;
                    }
                }
            }
        }
        return counter;
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
            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(assignment_5_tripletsum.findTriplet(input, x));

            t -= 1;
        }
    }
}
