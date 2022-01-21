package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check_array_rotation {

    public static int arrayRotateCheck(int arr[]){
        int highest = Integer.MIN_VALUE;
        int highest_index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > highest){
                highest = arr[i];
                highest_index = i;
            }
        }
        if (highest_index != arr.length-1 && highest_index != 0){
            return highest_index+1;
        }
        return 0;
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
            int ans = check_array_rotation.arrayRotateCheck(input);
            System.out.println(ans);

            t -= 1;
        }
    }

}
