package Fifty_Questions.Conditions;

public class roots_quadratic_eqaution {

    public static void main(String[] args) {
        //           012345678
        String eq = "2x^2+3x+5";

        String chs = "0";

        for (int i = 0; i <= eq.length()-1 ; i++) {
            if (i == 0 || i==5 || i==8)
            {
                //append !!
                for (int j = 0; j <= chs.length()-1; j++) {
                    chs+=eq.charAt(i);
                }
            }
        }



//        for (int i = 0; i <= chs.length()-1; i++) {
//            System.out.print(chs.charAt(i)+" ");
//        }

    }
}