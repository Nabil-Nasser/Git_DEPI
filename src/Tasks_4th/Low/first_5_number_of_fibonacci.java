package Tasks_4th.Low;

public class first_5_number_of_fibonacci {
    public static void main(String[] args) {

        System.out.print("fibonacci: ");

        for (int i = 0; i <= 5; i++)
        {
            int fib = 0;
            if(i == 0 || i==1)
            {
                fib = 1;
                System.out.print(fib + " ");
            }

            if(i >= 2) {
                fib = ( (fib-1) + (fib-2) );
                System.out.print(fib + " ");
            }
        }
    }
}

//need to fix