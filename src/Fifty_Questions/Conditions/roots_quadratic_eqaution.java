package Fifty_Questions.Conditions;

import java.util.Scanner;

public class roots_quadratic_eqaution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n"+"Enter the coefficients of quadratic equation as in form ax^2 + bx + c = 0");

        System.out.print("Enter the value of a : ");

        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");

        int b = sc.nextInt();

        System.out.print("Enter the value of c : ");

        int c = sc.nextInt();

        int decision_parameter = (b*b - (4*a*c));

        double sqrt = Math.sqrt( (Math.pow(b, 2)) - 4*a*c);

        if( decision_parameter > 0)
        {
            double x1 =  ( -b + sqrt) / (2*a) ;

            double x2 =  ( -b - sqrt) / (2*a) ;

            System.out.println("The roots of the quadratic equation are: "+x1 + " and " + x2);
        }

        else if( decision_parameter == 0)
        {

            double x = (-b + sqrt) / (2*a);

            System.out.println("There is one real root of this quadratic equation which is: "+ x);
        }

        else if ( decision_parameter < 0 ) System.out.println("No real Solution");

    }
}
