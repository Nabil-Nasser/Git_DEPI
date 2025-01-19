package Fifty_Questions.Methods;

import java.util.Scanner;

public class Factorial {
//method

    // as function static >> access without need to create an instant
    public static void Fact(int n)
    {
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac*=i;
        }
        System.out.println(fac);
    }

    public static void main(String[] args) {
        Fact(6);
    }
}