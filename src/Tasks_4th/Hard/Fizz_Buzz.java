package Tasks_4th.Hard;

public class Fizz_Buzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) System.out.print("Fizz" + " ");
            if (i%5 == 0) System.out.print("Buzz"+ " ");
            if (i%3 == 0 && i%5 == 0) System.out.print("FizzBuzz"+ " ");
            else if( !( i%3 == 0 || i%5 == 0 || (i%3 == 0 && i%5 == 0) ) ) System.out.print(i+ " ") ;
        }

    }
}
