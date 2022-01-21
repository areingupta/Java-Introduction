package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rotate_array {

    public static void rotate(int arr[], int d){
//        int n = arr.length;
//
//        for (int i = 0; i < d; i++){
//
//            for (int j = 0; j < n-1; j++){
//
//                if (j == n-i-1){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//                if (arr[j] < arr[j+1] && j < n-i-1){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }               FOR SORTED ARRAYS

//        for (int i = 0; i < d; i++){
//
//            int n = arr.length;
//
//            int temp = arr[0];
//
//            for (int j = 0; j < n-1; j++){
//                arr[j] = arr[j+1];
//            }
//
//            arr[n-1] = temp;
//        }               NON_OPTIMISED APPROACH

        int temp_array[] = new int[d];
        for (int i = 0; i < d; i++){
            temp_array[i] = arr[i];
        }
        int n = arr.length;

        for (int j = 0; j < n-d; j++){
            arr[j] = arr[j+d];
        }
        for (int k=arr.length-d,i = 0; k < arr.length && i < d; k++,i++){
            arr[k] = temp_array[i];
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
            int d = Integer.parseInt(br.readLine().trim());
            rotate_array.rotate(input, d);
            printArray(input);

            t -= 1;
        }
    }
}
