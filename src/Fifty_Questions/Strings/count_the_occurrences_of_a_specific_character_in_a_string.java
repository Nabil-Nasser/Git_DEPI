package Fifty_Questions.Strings;

import java.util.Scanner;

public class count_the_occurrences_of_a_specific_character_in_a_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");

        String str = sc.next().toLowerCase();

        System.out.print("Enter the char U wanna count the occurrence of it :");

        char ch = sc.next().toLowerCase().charAt(0);

        //String str = "AhmedAAA";

        int count = 0;

        //let the specific char is 'A' ..

        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == ch) count++;
        }

        System.out.println("The Occurrence of { "+ ch +" } is "+count);
    }
}
