package Second_java;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        if(num > 0)
        {
         if (num % 2 == 0) System.out.println("Positive and Even");
         if (num % 2 == 1) System.out.println("Positive and Odd");
        }
        else System.out.println("the number should be Positive");

    }
}
