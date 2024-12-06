package Second_java;

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter :");

        char c = sc.next().charAt(0);
        char c_lower = Character.toLowerCase(c);

        if ((c_lower == 'a' || c_lower == 'i' || c_lower == 'u' || c_lower == 'o' || c_lower == 'e')){
            System.out.println("it's a vowel letter");
        }

        if (!(c_lower == 'a' || c_lower == 'i' || c_lower == 'u' || c_lower == 'o' || c_lower == 'e')){
            System.out.println("it's a Consonant letter");
        }

    }
}
