package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largest_row_or_column {

    public static void findLargest(int mat[][]){

        int largestrow = Integer.MIN_VALUE;
        int largestcol = Integer.MIN_VALUE;
        int rows = mat.length;

        if(rows==0)
        {
            System.out.println("row 0 "+largestrow);
            return;
        }

        int cols = mat[0].length;
        int row_index = 0;
        int col_index = 0;

        for (int i = 0; i < rows; i++){
            int row_sum = 0;

            for (int j = 0; j < cols; j++){
                row_sum = row_sum + mat[i][j];
            }
            if (row_sum > largestrow){
                largestrow = row_sum;
                row_index = i;
            }
        }

        for (int j = 0; j < cols; j++){
            int col_sum = 0;

            for (int i = 0; i < rows; i++){
                col_sum = col_sum + mat[i][j];
            }
            if (col_sum > largestcol){
                largestcol = col_sum;
                col_index = j;
            }
        }

        if (largestrow >= largestcol){

            System.out.println("row "+ row_index +" "+ largestrow);

        } else {

            System.out.println("column "+ col_index +" "+ largestcol);

        }

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            largest_row_or_column.findLargest(mat);
            System.out.println();

            t -= 1;
        }
    }

}
