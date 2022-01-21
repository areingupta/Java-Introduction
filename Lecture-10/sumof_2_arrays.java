package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumof_2_arrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]){

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;
        int c = 0;

        while (k >= 0){
            int d = c;
            if (i >= 0){
                d = d + arr1[i];
            }
            if (j >= 0){
                d = d + arr2[j];
            }
            c = d / 10;
            d = d % 10;

            output[k] = d;

            i--;
            j--;
            k--;

            if (c != 0){
                output[0] = c;
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

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            sumof_2_arrays.sumOfTwoArrays(arr1, arr2, output);
            printArray(output);

            t -= 1;
        }
    }
}
