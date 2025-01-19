package Fifty_Questions.Methods;

import java.util.Scanner;

public class Area {

    public static void calc_area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Wanna calculate the area of circle, rectangle and triangle !");
        System.out.println();
        System.out.print("Enter the radius of the circle :");

        double radius = sc.nextDouble();

        System.out.print("Enter The height of rectangle :");
        double length_rectangle = sc.nextDouble();

        System.out.print("Enter the width of rectangle :");
        double width_rectangle = sc.nextDouble();

        System.out.print("Enter the base of the triangle :");
        double base_triangle = sc.nextDouble();

        System.out.print("Enter the height of the triangle :");
        double height_triangle = sc.nextDouble();

        System.out.println("\n"+"Good job!"+"\n");

        double area_of_circle = Math.round( Math.PI * Math.pow(radius,2) );
        double area_of_rectangle = length_rectangle * width_rectangle;
        double area_of_triangle = (0.5)*base_triangle*height_triangle;

        System.out.println("The area of circle = "+area_of_circle);
        System.out.println("\t"+"**************");
        System.out.println("The area of rectangle = "+area_of_rectangle);
        System.out.println("\t"+"**************");
        System.out.println("The area of triangle = "+area_of_triangle);
        System.out.println("\t"+"**************");
    }



    public static void main(String[] args) {
        calc_area();
    }
}
