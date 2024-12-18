package Tasks_4th.meduim;

import java.util.Scanner;

public class Smallest_of_3_nums_if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num :");
        int num1= sc.nextInt();
        System.out.print("Enter 2nd num :");
        int num2= sc.nextInt();
        System.out.print("Enter 3rd num :");
        int num3= sc.nextInt();
        int min = 0;


        if (num1 < num2 && num1 < num3) min = num1;
        if (num2 < num1 && num2 < num3) min = num2;
        else min = num3;

        System.out.println("the smallest num is: "+min);
    }
}
