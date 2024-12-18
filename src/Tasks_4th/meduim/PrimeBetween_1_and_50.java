package Tasks_4th.meduim;

public class PrimeBetween_1_and_50 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 50; i++) {// sqrt(50).round = 7
//                if (i>1 && i!=4 && i!=8){
//                    if( ((i==2)||(i==3)|| (i==5) )||( (i%3 > 0) && (i%5 > 0) && (i%7 > 0)) )
//                        System.out.print(i+" ");
//                }
        //}

        for (int num = 2; num <= 50; num++) {

            int sqrt_num = (int) Math.sqrt(num);

            //handle special cases
            if(num == 2){ System.out.println(num+" "); continue;}

            if(num%2 > 0){
                if(sqrt_num%2 ==0)//even
                {
                    for (int i=3; i<=(sqrt_num-1); i+=2) //start from first odd
                    {
                        while (num%i > 0)
                        {
                            System.out.println(num+" ");
                        }
//
                     }
                }

                if (sqrt_num%2 > 0)//odd
                {
                    for (int i=3; i<=sqrt_num; i+=2)
                    {
                        if (num%i == 0)
                        {
                            System.out.println(num+ " ");
                        }

                    }
                }
            }
        }
    }
}
