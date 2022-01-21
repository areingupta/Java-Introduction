package Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class merge_2_sorted {

    public static int[] merge(int arr1[], int arr2[]){
        int mergedArray[] = new int[(arr1.length+arr2.length)];
        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            }else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        if (i >= arr1.length){
            while (j < arr2.length){
                mergedArray[k] = arr2[j];
                k++;
                j++;
            }
        } else {
            while (i < arr1.length){
                mergedArray[k] = arr1[i];
                k++;
                i++;
            }
        }
        return mergedArray;
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

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge_2_sorted.merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }
}
