import java.util.Scanner;

public class problem_1 {

    public static void print2DArray(int input[][]){

        int rows = input.length;
        int n = rows;
        if (rows == 0){
            return;
        }
        int cols = input[0].length;
        int i = 0;

        for (i = 0; i < input.length; i++){

            int j = 0;
            while (j < rows - i){

                for (int k = 0; k < cols; k++){
                    System.out.print(input[i][k] + " ");
                }
                j++;
                System.out.println();
            }
        }


    }

    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput(){
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        problem_1.print2DArray(input);
    }


}
