package Fifty_Questions.Loops;

public class sum_of_the_first_50_natural_numbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum+=i;
        }
        System.out.print("Sum is: "+ sum);
    }
}
