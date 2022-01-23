import java.util.Scanner;

public class input {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = s.nextInt();

        int arr[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++){

            for (int j = 0; j < columns; j++){

                System.out.println("Enter element at"+i+" row"+j+" column");
                arr[i][j] = s.nextInt();
            }

        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
