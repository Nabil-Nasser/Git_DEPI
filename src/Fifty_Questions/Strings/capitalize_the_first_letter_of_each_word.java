package Fifty_Questions.Strings;

public class capitalize_the_first_letter_of_each_word {

    public static void main(String[] args) {

        String str = "ahmed ali hasan ibrahim";

        char[] str_char = new char[str.length()];

        for (int i = 0; i <= str_char.length-1; i++) {
            str_char[i] = str.charAt(i);
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            if (i==0) str_char[i]= Character.toUpperCase(str_char[i] );
            if (str_char[i]==' ')//white spaces separate between words in any String!!
            {
                //make it self upperCase.
                str_char[i+1]= Character.toUpperCase(str_char[i+1] );
            }
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            System.out.print(str_char[i]);
        }
    }
}