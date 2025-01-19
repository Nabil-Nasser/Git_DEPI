package Fifty_Questions.Conditions;

import java.util.Scanner;

public class char_vowel_or_consonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");

        char ch = sc.next().charAt(0);

        char[] vowels = {'a','e','i','u','o'};

        String flag = "0";

        for (int i = 0; i <= vowels.length-1; i++) {
            if (Character.toLowerCase( vowels[i] ) == Character.toLowerCase( ch ) ) flag+="t";
            else flag+="f";
        }

       if (flag.contains("t")) System.out.println("The character is vowel.");
       else System.out.println("The character is consonant.");


    }
}
