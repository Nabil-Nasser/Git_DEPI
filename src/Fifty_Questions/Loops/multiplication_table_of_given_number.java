package Fifty_Questions.Loops;

import java.util.Scanner;

public class multiplication_table_of_given_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");

        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * "+ i+ " = " +num*i);
        }

    }
}
