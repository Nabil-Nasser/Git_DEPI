package Fifty_Questions.Methods;

public class num_of_vowels {

    public static void num_of_vowels_in_string(String str)
    {
        char[] vowels = {'a','e','i','o','u'};

        int count = 0 ;

        for (int i = 0; i <= vowels.length-1; i++) {
            for (int j = 0; j <= str.length()-1 ; j++) {
                //to can match regardless the state of the character (uppercase or lowercase)
                if ( Character.toLowerCase( vowels[i]) == Character.toLowerCase( str.charAt(j) ) )count++;
            }
        }

        System.out.println("The number of vowels in "+ str +" = "+count);

    }


    public static void main(String[] args) {

        num_of_vowels_in_string("Ahmed");
    }
}
