package Fifty_Questions.Conditions;

public class Divisible_by_3_and_5 {

    public static void main(String[] args) {
        int num = 15;

        if (num%3==0 && num%5==0)
        {
            System.out.println("The number is divisible by 3 and 5");
        }
        else System.out.println("The number not divisible by 3 and 5");
    }
}
