package assignment_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spiral_print {

    public static void spiralPrint(int mat[][]){

        // LOOK AT THIS QUESTION (if possible).

        if(mat.length==0){
            return;
        }
        int rowS=0,colS=0,rowE=mat.length-1;
        int colE=mat[0].length-1;
        int i=0,j=0,c=0;
        int mul=mat.length*mat[0].length;
        while(c<mul){
            while(j<=colE){
                System.out.print(mat[i][j]+" ");
                c++;
                j++;
            }
            rowS+=1;
            i=rowS;
            j--;
            while(i<=rowE){
                System.out.print(mat[i][j]+" ");
                c++;
                i++;
            }
            colE-=1;
            j=colE;
            i--;
            while(j>=colS){
                System.out.print(mat[i][j]+" ");
                c++;
                j--;
            }
            rowE-=1;
            i=rowE;
            j++;
            while(i>=rowS){
                System.out.print(mat[i][j]+" ");
                c++;
                i--;
            }
            colS+=1;
            i++;
            j=colS;

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

            spiral_print.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }

}
