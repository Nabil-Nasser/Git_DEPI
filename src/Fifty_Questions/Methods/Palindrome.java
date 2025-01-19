package Fifty_Questions.Methods;

public class Palindrome {

    public static void palindrome(String str)
    {
        String flag = "0";
        for (int i = 0; i <= (str.length()-1)/2; i++) {
            if (str.charAt(i)== str.charAt(str.length()-1-i)) flag+="t";
            else flag+="f";
        }
        if (flag.contains("f")) System.out.println("Not Palindrome");
        else System.out.println("Palindrome");

    }


    public static void main(String[] args) {
        palindrome("1011");
    }
}
