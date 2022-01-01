package keywords;

public class break_2 {
    public static void main(String[] args){
        int n = 4;
        int i = 1;
        while (i <= n){
            int j = 1;
//            while (j <= n){
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
            while ( j <= n){
                System.out.print(j + " ");
                j++;
                if (j > i){    // instead of break, we could have changed to j <= i !
                    break;
                }
            }
            System.out.println();
            i++;
        }
    }
}
