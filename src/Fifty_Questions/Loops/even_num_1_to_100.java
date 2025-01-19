package Fifty_Questions.Loops;

public class even_num_1_to_100 {
    public static void main(String[] args) {

        System.out.print("Even Number are : ");
        System.out.println();
        int i = 1;

        while (i<=100){

            if (i%2 == 0)
            {
                System.out.print(i+" ");
                if(i<=10) { System.out.print(" ");}//to be aligned with each other
                if (i%2==0 && i%5==0){System.out.println();} // to be readable
            }
            i++;
        }
    }
}
