package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment_6_sort01 {

    public static void sortZeroesAndOne(int arr[]){

//        int nextZero = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                int temp = arr[nextZero];
//                arr[nextZero]=arr[i];
//                arr[i]=temp;
//                nextZero++;
//            }
//
//        }

        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int leftNumber = arr[i];
            int rightNumber = arr[j];

            if (leftNumber == 0){
                i++;
            }
            if (rightNumber == 1){
                j--;
            }
            if (leftNumber==1 && rightNumber==0){
                arr[i] = rightNumber;
                arr[j] = leftNumber;
                i++;
                j--;
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
            assignment_6_sort01.sortZeroesAndOne(input);
            printArray(input);

            t -= 1;
        }
    }
}
