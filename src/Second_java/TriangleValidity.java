package Second_java;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st angle :");
        double angle1 = sc.nextDouble();

        System.out.print("Enter 2nd angle :");
        double angle2 = sc.nextDouble();

        System.out.print("Enter 3rd angle :");
        double angle3 = sc.nextDouble();

//        System.out.println((angle1 + angle2 + angle3) == 180 ? "the three angles can form a valid triangle":"the three angles cannot form a valid triangle");

        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("The three angles can form a valid triangle");
        }

        if ((angle1 + angle2 + angle3) != 180) {
            System.out.println("The three angles cannot form a valid triangle");
        }

    }
}
