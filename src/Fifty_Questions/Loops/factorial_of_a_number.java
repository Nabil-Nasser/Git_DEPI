package Fifty_Questions.Loops;

public class factorial_of_a_number {

    public static void main(String[] args) {

        int num = 20;
        long fact = 1;

        for (int i = 0; i < num; i++) {
            fact*=(num-i);
        }
        System.out.println(fact);

    }
}
