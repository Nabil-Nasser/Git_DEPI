package Fifty_Questions.Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st num :");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd num :");
        int b = sc.nextInt();

        int reminder;

        while(b!=0)
        {
            reminder = a % b;
            a = b;
            b = reminder;
        }
        System.out.println("GCD is : "+ a);

    }
}
