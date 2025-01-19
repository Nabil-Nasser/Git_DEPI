package Fifty_Questions.Strings;

public class Contains_Only_Digits {

    public static void main(String[] args) {

        String str = "";

        //[0-9] > to confirm at least one digit exist ! [0-9]* > one or more !!
        if ( str.matches("[0-9][0-9]*") ) System.out.println("The String contains only digits.(at least one)");
        else System.out.println("The String contains other types");


    }
}
