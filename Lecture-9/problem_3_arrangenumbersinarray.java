package problems;

import jdk.jshell.EvalException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_3_arrangenumbersinarray {

    public static void arrange(int arr[], int n) {
        int value1 = 1;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            arr[i] = value1;
            value1 = value1 + 2;
        }
        if (n % 2 != 0) {
            int value2 = n - 1;
            for (int i = ((n - 1) / 2) + 1; i <= (arr.length) - 1; i++) {
                arr[i] = value2;
                value2 = value2 - 2;
            }
        }
        if (n % 2 == 0) {
            int value2 = n;
            for (int i = ((n - 1) / 2) + 1; i <= (arr.length) - 1; i++) {
                arr[i] = value2;
                value2 = value2 - 2;
            }
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            problem_3_arrangenumbersinarray.arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
}
