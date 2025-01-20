package Fifty_Questions.Conditions;

public class roots_quadratic_eqaution {

    public static void main(String[] args) {
        //only work when coefficients are +ve int and need to write 1.

        //           012345678
        String eq = "1x^2+5x+6";

        String coefficients = "";

        for (int i = 0; i <= eq.length()-1 ; i++) {
            if (i == 0 || i==5 || i==8)
            {
                //add eq.charAt(0), eq.charAt(3), eq.charAt(8) as them are the coefficients!!
                coefficients+=eq.charAt(i);
            }
        }

        // calculate the roots of the quadratic equation ax^2 + bx + c = 0 is (-b ± √(b^2 - 4ac) / 2a) >> -2,-3 !!

        //extract the coefficients from the string.
        int a = coefficients.charAt(0)-48;
        int b = coefficients.charAt(1)-48;
        int c = coefficients.charAt(2)-48;

        // reduce calculations ..
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double x1 = ( -b + sqrt) /2*a ;

        double x2 = ( -b - sqrt) /2*a;

        System.out.println("The roots of the quadratic equation are: "+x1 + " and " + x2);

        //testing..
        //System.out.println(  a+ " " + b + " " + c);

        for (int i = 0; i <= coefficients.length()-1; i++) {
            System.out.print(coefficients.charAt(i));
        }

    }
}
