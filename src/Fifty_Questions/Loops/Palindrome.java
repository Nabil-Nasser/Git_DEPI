package Fifty_Questions.Loops;

public class Palindrome {
    public static void main(String[] args) {

       int num = 1001;

       String str_num = String.valueOf(num);

       char[] str_char = Character.toChars(num);

        System.out.println(str_num);

        for (int i = 0; i <= (str_char.length)/2 ; i++) {
            if(str_char[i]== str_char[str_char.length-1]){}
        }

    }
}
