package Tasks_4th.meduim;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        System.out.print("the reverse of "+num+" is :");
        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
