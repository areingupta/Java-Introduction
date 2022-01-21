package Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selection_sort {

    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++){ //index wise 0 to length-2
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
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
            selection_sort.selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }
}
