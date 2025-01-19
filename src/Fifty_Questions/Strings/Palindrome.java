package Fifty_Questions.Strings;

public class Palindrome {

    public static void main(String[] args) {

        String str = "nlln"; // to be checked

        char[] str_ch = new char[str.length()];

        for (int i = 0; i <= str_ch.length-1; i++) {
            str_ch[i]= str.charAt(i);
        }

        String flag = "0";
        for (int i = 0; i <= (str_ch.length-1)/2; i++) {
            if (  (str_ch[0+i]) ==(str_ch[str_ch.length-1-i]) )
            {
                flag+="t";
            }
            else flag+="f";
        }

        //for testing..

//        for (int i = 0; i <= str_ch.length-1; i++) {
//            System.out.print(str_ch[i]+" ");
//        }

//        System.out.println(flag);

        if (flag.contains("f")){
            System.out.println("Not Palindrome");
        }
        else System.out.println("Palindrome");

    }
}