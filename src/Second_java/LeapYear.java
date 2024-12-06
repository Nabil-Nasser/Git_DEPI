package Second_java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days in a year: ");
        double num_of_days_of_a_year = sc.nextDouble();

        if (num_of_days_of_a_year > 365){
            System.out.println("it's a leap year");
            return;//exit the method
        }

        System.out.println("it's not a leap year");
    }
}
