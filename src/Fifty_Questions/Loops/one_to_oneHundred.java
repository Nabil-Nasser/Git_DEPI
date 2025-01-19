package Fifty_Questions.Loops;

public class one_to_oneHundred {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
            if(i<=10) { System.out.print(" ");}//to be aligned with each other
            if (i%2==0 && i%5==0){System.out.println();} //just to be readable
        }
    }
}
