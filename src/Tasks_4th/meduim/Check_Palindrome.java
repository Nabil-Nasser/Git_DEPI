package Tasks_4th.meduim;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number ");

        String flag = "0";
        String str_num = String.valueOf(num);
        if(str_num.length() % 2 ==0)
        {
            for (int i = 0; i < str_num.length()-1; i++)
            {
                if (str_num.charAt(i) == str_num.charAt(str_num.length()-1-i ) )
                {
                    flag+="t";
                }
                else flag+="f";
            }
            System.out.println(flag.contains("f")?"not palindrome": "palindrome");
        }
        else System.out.println("the number not palindrome");
    }
}
