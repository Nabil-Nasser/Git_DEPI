package Fifty_Questions.Conditions;

public class largest_of_3_numbers {

    public static void main(String[] args) {

        int num1 = 9999;
        int num2 = 9000;
        int num3 = 70000;

        int max = num1;

        if (num2 > max) { max = num2; }

        if (num3 > max) { max = num3; }

        else if(num2 < max && num3 < max) max = num1;

        System.out.println("Largest Number is : "+max);
    }
}