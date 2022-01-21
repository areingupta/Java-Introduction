public class problem_1_func {
    public static void printFahrenheitTable(int start, int end, int step){
        int i = start;
        while (i <= end){
            int cel = (5/9)*(i - 32);
            System.out.println(i+"\t"+cel);
            i = i + step;
        }
    }
}
