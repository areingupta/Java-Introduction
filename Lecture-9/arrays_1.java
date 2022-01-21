package Arrays;

public class arrays_1 {
    public static void main(String[] args){
        int arr[] = new int[10];
        arr[3] = 15;
//        arr[10] = 10;
        System.out.println(arr[3]);
//        System.out.println(arr[10]);  // index out of bound exception
        System.out.println(arr[0]);
        System.out.println(arr[8]); // by default, if value isn't assigned, it becomes 0.

        char arrC[] = new char[11];
        double arrD[] = new double[10];
        boolean arrB[] = new boolean[5];

        System.out.println(arrC);
        System.out.println(arrC[2]);

        System.out.println(arrD);
        System.out.println(arrD[2]);

        System.out.println(arrB[0]);
    }
}
