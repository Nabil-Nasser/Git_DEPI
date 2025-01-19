package Fifty_Questions.Strings;

public class two_strings_are_anagrams {

    public static void main(String[] args) {

        String str1 = "Ahmed";

        String str2 = "Ahmed";

        String flag = "0";

        for (int i = 0; i <= str1.length()-1; i++) {
            for (int j = 0; j <= str2.length()-1; j++) {
                if (str1.charAt(i) ==  str2.charAt(j)) flag+="t";
                else flag+="f";
            }
        }

        int count = 0;

        for (int i = 0; i <= flag.length()-1; i++) {
            if ( flag.charAt(i) == 't') count++;
        }

        if (count == str2.length())
        {
            System.out.println("anagrams");
        }
        else System.out.println("not");


        //for testing..

//        System.out.println(flag);
//        System.out.println(str1==str2);  // just ??
//        System.out.println(Character.toLowerCase(str1.charAt(0)));

    }
}
