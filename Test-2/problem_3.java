import java.util.Scanner;

public class problem_3 {

    public static void leaders(int input[]){

        int leader = input[0]; // wasn't used

        for (int i = 0; i < input.length; i++){

            int greatest = input[i];

            for (int j = i + 1; j < input.length; j++){

                if (input[j] > greatest){
                    greatest = input[j];
                    break;  // without break, time limit was exceeding!
                }

            }

            if (greatest == input[i]){
                System.out.print(greatest + " ");
            }


        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        problem_3.leaders(input);
    }

}
