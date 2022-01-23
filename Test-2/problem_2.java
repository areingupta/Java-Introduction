import java.util.Scanner;

public class problem_2 {

    public static String minLengthWord(String input){

        int space = 0;
        int start = 0;
        int end = 0;

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i <= input.length(); i++){

            if (i == input.length() || input.charAt(i) == ' '){

                int length = i - space;

                if (minLength > length){
                    minLength = length;
                    start = space;
                    end = i;
                }

                space = i + 1;

            }

        }

        return input.substring(start,end);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(problem_2.minLengthWord(str));
    }

}
