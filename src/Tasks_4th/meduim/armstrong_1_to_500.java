package Tasks_4th.meduim;

import javax.management.ObjectInstance;

public class armstrong_1_to_500 {
    public static void main(String[] args) {

        for (int i =1; i <= 499 ; i++)
        {
            String str_i = String.valueOf(i);
            int len = Integer.parseInt(String.valueOf(str_i.length() ));

            if (len == 1) { if( (int)Math.pow((int)str_i.charAt(0)-'0',len) == i) {System.out.print(i+" ");continue;} continue; }

            if (len == 2)
            {
                if((int) Math.pow((int)str_i.charAt(0)-'0',len) + (int)Math.pow((int)str_i.charAt(1)-'0',len) == i)
                {
                    System.out.print(i+" ");continue;
                }
                continue;
            }
            else
            {
                if((int) Math.pow((int)str_i.charAt(0)-'0',len) +(int) Math.pow((int)str_i.charAt(1)-'0',len) + (int)Math.pow((int)str_i.charAt(2)-'0',len) == i)
                {
                    System.out.print(i+" ");continue;
                }
                continue;
            }
        }
    }
}
