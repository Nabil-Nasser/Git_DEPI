package Fifty_Questions.Strings;

import java.util.Locale;

public class Count_of_vowels_and_consonants {

    public static void main(String[] args) {
        String str = "Ahmed";

        String[] vowels = {"a","o","u","i","e"};

        String[] str_char = new String[str.length()];

        String flag = "0";

        for (int i = 0; i <= str_char.length-1; i++) {
            str_char[i] = String.valueOf((str.charAt(i))).toLowerCase();
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            System.out.print(str_char[i]+" ");
        }

        System.out.println();

        for (int i = 0; i <= str_char.length-1; i++) {
            for (int j = 0; j <= vowels.length-1; j++) {
                if ( String.valueOf((str_char[i])) == String.valueOf(vowels[j]) ) // not work !!!
                {
                    flag+="t";
                }
                else flag+="f";
            }
        }

        System.out.println(flag);

        int count = 0;
        for (int i = 0; i <= flag.length()-1; i++) {
            if (flag.contains("t")) count++;
        }

        System.out.println("count = "+ count);

    }
}
