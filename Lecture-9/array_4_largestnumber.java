package Arrays;

import java.util.Scanner;

public class array_4_largestnumber {

    public static int largestOfArray(int inputArr[]){
        int max = Integer.MIN_VALUE;
        int size = inputArr.length;
        for (int i = 0; i < size; i++){
            if (inputArr[i] > max){
                max = inputArr[i];
            }
        }
        return max;
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int inputArr[] = new int[size];
        for (int i = 0; i < size; i++){
            inputArr[i] = s.nextInt();
        }
        return inputArr;
    }

    public static void main(String[] args){
        int arr[] = takeInput();

        int max = largestOfArray(arr);

//        System.out.println(arr);   this doesn't print the array instead the address of array.

        System.out.println(max);
    }

}
