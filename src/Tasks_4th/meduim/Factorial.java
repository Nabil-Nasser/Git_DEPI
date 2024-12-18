package Tasks_4th.meduim;

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int factorial=1;
        System.out.print("Factorial Of "+ num +" is ");
        for (int i = num; i >= 1; i--) {
            factorial*=i;
        }
            System.out.print(factorial);
    }
}
