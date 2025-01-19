package Fifty_Questions.Loops;

import java.util.Scanner;

public class Fibonacci_series_up_to_n_terms {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a num: ");
//
//        int num = sc.nextInt();

        int[] arr = new int[10];

        for (int i = 0; i <= 10; i++) {

            if(i==0 || i==1) { System.out.print(i+" ");}
            else if (i==2){System.out.print(1);}
            else
            {
               System.out.print(" "+ ((i-1)+(i-2)));
            }
        }

    }
}
