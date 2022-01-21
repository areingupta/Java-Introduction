package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment_3_arrayintersection {

    public static void intersections(int arr1[], int arr2[]){

        for (int i = 0; i < arr1.length; i++){
            int j = 0;
            for (j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
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


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            assignment_3_arrayintersection.intersections(input1, input2);
            System.out.println();

            t -= 1;
        }
    }
}
