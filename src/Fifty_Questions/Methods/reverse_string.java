package Fifty_Questions.Methods;

public class reverse_string {

    public static void reverse_string(String str)
    {
        char[] str_char = new char[str.length()];

        for (int i = 0; i <= (str_char.length-1); i++) {
            str_char[i]= str.charAt(str.length()-1-i);
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            System.out.print(str_char[i]);
        }
    }

    public static void main(String[] args) {

    reverse_string("Ahmed Ibrahim Ali");

    }
}
