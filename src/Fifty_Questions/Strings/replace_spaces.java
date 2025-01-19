package Fifty_Questions.Strings;

public class replace_spaces {

    public static void main(String[] args) {

        String str = "A h m e d";

        char[] str_char = new char[str.length()];

        for (int i = 0; i <= str_char.length-1; i++) {
            str_char[i] = str.charAt(i);
        }


        for (int i = 0; i <= str_char.length-1; i++) {
            if (str_char[i] == ' ')
            {
                str_char[i] = '-';
            }
        }

        for (int i = 0; i <= str_char.length-1; i++) {
            System.out.print(str_char[i]);
        }


        //testing..
        //System.out.println(Character.valueOf('-') == str.charAt(1));


        //System.out.println("here"+str.charAt(1)+"There");

    }
}
