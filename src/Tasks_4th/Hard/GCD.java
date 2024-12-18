package Tasks_4th.Hard;

public class GCD {
    public static void main(String[] args) {
        int num1 = 25;
        int num2= 5;
        int reminder;

        while (num2 !=0)
        {
              reminder = num1 % num2;
                num1 = num2;
                num2 = reminder;
        }
        System.out.println(num1);
    }
}
