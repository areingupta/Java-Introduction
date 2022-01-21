package Arrays;

import java.util.Scanner;

public class array_3_movingtofunction {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int inputArr[] = new int[size];
        for (int i = 0; i < size; i++){
            inputArr[i] = s.nextInt();
        }
        return inputArr;
    }

    public static void print(int inputArr[]){
        int size = inputArr.length;
        for (int i = 0; i < size; i++){
            System.out.print(inputArr[i]+" ");
        }
    }

    public static void main(String[] args){

        int arr[] = takeInput();
        print(arr);
    }
}
