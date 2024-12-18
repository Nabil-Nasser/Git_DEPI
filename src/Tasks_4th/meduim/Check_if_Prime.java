package Tasks_4th.meduim;

import java.util.Arrays;

public class Check_if_Prime {
    public static void main(String[] args) {
        int num= 101;
        int sqrt_num = (int) Math.sqrt(num);

        //handle special cases
        if(num == 2){ System.out.println("Prime"); return;}
        if(num < 2){ System.out.println("Not Prime"); return;}
        if(num%2 == 0 && num > 2) { System.out.print("number" + num + "is not prime"); return;}

        if(num%2 > 0){
            if(sqrt_num%2 ==0)//even
            {
                for (int i=3; i<=(sqrt_num-1); i+=2) //start from first odd
                {
                    while (num%i == 0)
                    {
                        System.out.print("not prime");return;
                    }
//
                     { System.out.println("prime");return;}
                }
            }

             String flag = "0";
            if (sqrt_num%2 > 0)//odd
            {
                for (int i=3; i<=sqrt_num; i+=2)
                {
                    if (num%i == 0)
                    {
                        flag +="t";
//                        System.out.print("not prime");break;
                    }
                    else
                    {
                        flag +="f";
                    }
//                  System.out.println("prime");
                }
                System.out.println( flag.contains("t")? "not prime": "prime" );
            }
        }
    }
}

//need to fix
