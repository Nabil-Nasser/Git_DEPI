package Fifty_Questions.Strings;

public class reverse_string {

    public static void main(String[] args) {

        String str = "Ahmed";

        char[] str_char = new char[str.length()];


        for (int i = 0; i <= (str_char.length-1); i++) {
            str_char[i]= str.charAt(str_char.length-1-i);
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            System.out.print(str_char[i]+" ");
        }

    }
}
