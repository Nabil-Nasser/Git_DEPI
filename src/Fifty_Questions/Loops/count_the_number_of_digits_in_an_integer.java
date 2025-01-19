package Fifty_Questions.Loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class count_the_number_of_digits_in_an_integer {

    public static void main(String[] args) {

        int num = 1240;

        while (num>=0)
        {
                if (num<=9)       System.out.println("the number has one digit");
           else if (num<=99)      System.out.println("the number has two digit");
           else if (num<=999)     System.out.println("the number has three digit");
           else if (num<=9999)    System.out.println("the number has four digit");
           else if (num<=99999)   System.out.println("the number has five digit");
           else if (num<=999999)  System.out.println("the number has six digit");
           else if (num<=9999999) System.out.println("the number has seven digit");
            return;
        }
    }
}
