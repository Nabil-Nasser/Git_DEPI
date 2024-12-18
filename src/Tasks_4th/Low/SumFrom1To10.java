package Tasks_4th.Low;

public class SumFrom1To10 {
    public static void main(String[] args) {


        int i = 0;
        int sum = 0;

        while (i<=10){
            sum+=i;
            i++;
        }
            System.out.print("Sum of numbers from 1 to 10: "+ sum);
    }
}
