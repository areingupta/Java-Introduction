public class jagged_arrays {

    public static void main(String[] args){

        int arr[][] = new int[3][5];

        System.out.println(arr[0]);

        int arr2[][] = new int[4][];  // Only master array is created with this syntax with no entries in it for 1D arrays.

        System.out.println(arr2);

//        System.out.println(arr2[0]); // prints null, and all other entries are also null.

//        for (int i = 0; i < arr2.length; i++){
//            arr2[i] = new int[2];           // initialises 1d arrays of size 2 to each entry of master array.
//            System.out.println(arr2[i]);
//        }

        // to make jagged array

        for (int i = 0; i < arr2.length; i++){

            arr2[i] = new int[i + 2];
        }

        for (int i = 0; i < arr2.length; i++){

            for (int j = 0; j < arr2[i].length; j++){

                System.out.print(arr2[i][j]);

            }
            System.out.println();
        }
    }

}
