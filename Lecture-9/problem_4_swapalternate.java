package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_4_swapalternate {

    public static void swapAlternate(int arr[]){
        if(arr.length%2 != 0){
            for(int i = 0; i < arr.length; i = i + 2){
                if (i == arr.length-1){
                    continue;
                }
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        } else {
            for(int i = 0; i < arr.length; i = i + 2){
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }
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

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            problem_4_swapalternate.swapAlternate(input);
            printArray(input);
            t -= 1;
        }
    }
}
