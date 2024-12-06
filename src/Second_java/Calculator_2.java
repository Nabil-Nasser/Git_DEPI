package Second_java;

import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a (1st num) :");
        double a = sc.nextDouble();

        System.out.print("Enter value of b (2nd num) :");
        double b = sc.nextDouble();

        System.out.print("Enter the operator between (+, -, *, /) :");
        char operator = sc.next().charAt(0);

        double c;

        if(operator == '+') {
            c = a + b;
            System.out.println("addition : c = a + b = " + c);
        }
        if(operator == '-') {
            c = a - b;
            System.out.println("subtraction : c = a - b = " + c);
        }
        if(operator == '*') {
            c = a * b;
            System.out.println("multiplication : c = a * b = " + c);
        }
        if(operator == '/') {
            c = a / b;
            System.out.println("division  : c = a / b = " + c);
        }
    }
}
