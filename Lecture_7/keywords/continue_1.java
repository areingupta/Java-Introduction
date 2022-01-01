package keywords;

public class continue_1 {
    public static void main(String[] args){
        int i = 1;
//        while (i<=10){
////            if (i == 5){
////                break;
////            }
//            if (i==5){
//                i++;  // if we don't put i++ here, i will remain 5 and infinite loop will start as i++ given later we dont reach.
//                continue;
//            }
//            System.out.println(i);
//            i++;

        for (int k = 1; k<=10; k++){
            if (k==5){
                continue;
            }
            System.out.println(k);
        }

    }
}
