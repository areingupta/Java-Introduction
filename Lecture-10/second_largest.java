package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class second_largest {

    public static int secondLargestElement(int[] arr){

        int highest = Integer.MIN_VALUE;
        int sec_highest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > highest){
                sec_highest = highest;
                highest = arr[i];
            }
            if (arr[i] < highest && arr[i] > sec_highest){
                sec_highest = arr[i];
            }
        }

        return sec_highest;

//        for (int i = 0; i < arr.length-1; i++){ //index wise 0 to length-2
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++){
//                if (arr[j] < min){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i){
//                arr[minIndex] = arr[i];
//                arr[i] = min;
//            }
//        }
//        int largest = arr[arr.length-1];
//        int sec_largest = 0;
//        for (int i = arr.length-2; i >= 0; i--){
//            if (arr[i] == largest){
//                continue;
//            }
//            if (arr[i] != largest){
//                sec_largest = arr[i];
//                break;
//            }
//        }
//        if (sec_largest != 0){
//            return sec_largest;
//        }
//
//        return Integer.MIN_VALUE;      TIME LIMIT EXCEEDED
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
            int ans = second_largest.secondLargestElement(input);
            System.out.println(ans);

            t -= 1;
        }
    }

}
