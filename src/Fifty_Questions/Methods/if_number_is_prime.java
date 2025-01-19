package Fifty_Questions.Methods;

public class if_number_is_prime {

    public static void Prime(int n)
    {
        if(n == 1 || n==0){ System.out.println("Not Prime"); return;}

        if (n % 2 == 0 ){  System.out.println("Not Prime"); return;}

        else if (n > 0 && n % 2 > 0)
        {
           int sqRoot =(int) Math.sqrt(n);

           String flag = "0";



           for (int i = 3; i <= sqRoot; i+=2)
           {
               if (n % i > 0) flag+="t";
               else flag+="f";
           }

           if (flag.contains("f")) System.out.println("Not Prime");
           else System.out.println("Prime");
        }

    }



    public static void main(String[] args) {
        Prime(8);
    }
}
