package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_boundaries_and_diagonals {

    public static void totalSum(int[][] mat) {

        int sum=0;
        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[i].length;j++){

                if(i==0||i==mat.length-1){
                    sum+=mat[i][j];
                }

                else {
                    if(i==j||i+j==mat.length-1)
                        sum+=mat[i][j];
                }
            }
        }

        for(int i=1;i<mat.length-1;i++){

            for(int j=0;j<mat[i].length;j++){

                if(j==0||j==mat[i].length-1){
                    sum+=mat[i][j];
                }
            }
        }

        System.out.println(sum);

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            sum_boundaries_and_diagonals.totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
}
