package Fifty_Questions.Loops;

public class reverse_a_number {
    public static void main(String[] args) {

        //while

        int num = 47;

        while (num>9){

            if(num<100)
            {
             int a = num%10;
             int b = (num%100 - a) /10;
             System.out.println("The number after reverse is : "+a+""+b);
            }

           else if(num<1000)
            {
                int a = num%10;
                int b = (num%100 - a) /10;
                int c = (num%1000 - b) /100;
                System.out.println("The number after reverse is : "+a+""+b+""+c);
            }

            else if(num<10000)
            {
                int a = num%10;
                int b = (num%100 - a) /10;
                int c = (num%1000 - b) /100;
                int d = (num%10000 - c) /1000;
                System.out.println("The number after reverse is : "+a+""+b+""+c+""+d);
            }

            else if(num<100000)
            {
                int a = num%10;
                int b = (num%100 - a) /10;
                int c = (num%1000 - b) /100;
                int d = (num%10000 - c) /1000;
                int e = (num%100000 - c) /10000;
                System.out.println("The number after reverse is : "+a+""+b+""+c+""+d+""+e);
            }

            return;
        }

    }
}
