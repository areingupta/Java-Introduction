public class trial_1 {


    public static void main(String[] args){

        int arr2D [][] = new int[3][4];

        int arr2[][] = {{1,2,3},{4,5,6}};  // 1,2,3 is first row, 4,5,6 is second row.

        System.out.println(arr2D[1][2]);

        arr2D[2][0] = 15;

        System.out.println(arr2D[2][0]);

        System.out.println(arr2D.length);

    }

}
