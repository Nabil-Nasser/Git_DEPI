package Fifty_Questions.Strings;

import java.util.Arrays;

public class Longest_word_in_string {

    public static void main(String[] args) {

        String str = "Ahmed ALi Hassan Mahmoud";

        char[] str_char = new char[str.length()];

        for (int i = 0; i <= str.length()-1; i++) {
            str_char[i]= str.charAt(i);
        }

//        System.out.println(str_char.length);
        int count = 0;

        int[] arr_count = new int[10];

        for (int i = 0; i <= str_char.length-1; i++) {
            if (str_char[i] != ' ')
            {
                count++;
            }

//            int arr_count_length = arr_count.length-1

            if (str_char[i]== ' ' || i== (str_char.length-1))
            {
                for (int j = 0; j <= arr_count.length-1; j++) {
                    //need to append (add) not replace (rewrite) !!
                    arr_count[j] = count;
                    break;
                }
                count = 0;
            }
        }

        int max = arr_count[0];

        for (int i = 0; i <= arr_count.length-1; i++) {
            if(arr_count[i] > max) max = arr_count[i];
        }

        System.out.println(max);

        for (int i = 0; i <= str_char.length-1; i++) {
            if (str_char[i] != ' ' || i == str_char.length-1) {
                count++;
            }

            if (str_char[i] == ' ' && count!=max) count=0;

            if (count==max)
            {
                for (int j = (str_char.length-max); j <= str_char.length-1; j++) {
                    System.out.print(str_char[j]);
                }
            }
        }

        System.out.println();
        for (int i = 0; i <= arr_count.length-1; i++) {
            System.out.print(arr_count[i]+" ");
        }

    }
}
