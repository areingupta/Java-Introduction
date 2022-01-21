public class substring_function {

    public static void main(String[] args){

         String str1 = "Coding";

         String subStr = str1.substring(1,5);

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(6));     //gives empty string
       // System.out.println(str1.substring(7));  // indexoutofbounds
        System.out.println(subStr.length());
    }

}
