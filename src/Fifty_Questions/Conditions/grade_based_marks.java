package Fifty_Questions.Conditions;

public class grade_based_marks {

    public static void main(String[] args) {

        int grade = 77;

        if (grade >= 90 && grade <= 100 ) System.out.println("Excellent");
        else if (grade >= 80 && grade <= 89) System.out.println("Very Good");
        else if (grade>= 70 && grade <= 79) System.out.println("Good");
        else if (grade>= 60 && grade <= 69) System.out.println("Accept");
        else if (grade>= 50 && grade <= 59) System.out.println("pass");
        else if (grade >= 0 && grade <= 49) System.out.println("Fail");


    }

}
