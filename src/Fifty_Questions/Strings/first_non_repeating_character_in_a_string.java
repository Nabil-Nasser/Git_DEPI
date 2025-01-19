package Fifty_Questions.Strings;

public class first_non_repeating_character_in_a_string {

    public static void main(String[] args) {
                    //0123456789
        String str = "aasseeqqlmmvsc";

        int count = 0;

        for (int i = 0; i <= str.length()-2 ; i++) {
            if (count == 1) return;
            if ((str.charAt(i)!=str.charAt(i+1)) && (str.charAt(i-1)!=str.charAt(i)) )
            {
                System.out.println("1st non repeat char : " + str.charAt(i));
                count++;
            }
        }
//        System.out.println( str.charAt(0) == str.charAt(2));

    }
}
