package Second_java;

import java.util.Scanner;

public class filterAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :");
        int age = sc.nextInt();

        if (age > 30 && age > 50) System.out.println("you're so old");

        if (age > 30 && age < 50) System.out.println("you're old enough");

    }
}
