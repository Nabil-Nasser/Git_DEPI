package Tasks_4th.Low;

public class CheckIfpos_neg_zero {
    public static void main(String[] args) {

        int num = -10;

        if (num != 0)
        {
            if(num > 0) System.out.print("The Number is Positive");
            else System.out.print("The Number is Negative");
        }
        else System.out.print("The Number is Equal Zero");
    }
}
