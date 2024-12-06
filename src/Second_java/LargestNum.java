package Second_java;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st num :");
        double num1 = sc.nextDouble();

        System.out.print("Enter the 2nd num :");
        double num2 = sc.nextDouble();

        System.out.print("Enter the 3rd num :");
        double num3 = sc.nextDouble();


        double largest = 0;

        if(num1 > num2)
            largest = num1;
        if (num2 > num3)
            largest = num2;
        if (num3 > num1)
            largest = num3;
        if (num1 > num3)
            largest = num1;
        if (num2 > num1)
            largest = num2;
        if (num3 > num1)
            largest = num3;

        System.out.println("The Largest Number is : " + largest);

    }
}
