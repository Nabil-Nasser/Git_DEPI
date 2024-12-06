package Second_java;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Grade:");
        double grade = sc.nextDouble();

        if(grade >= 60){
            if (grade >= 90) System.out.println("your grade is : A+");
            else if (grade >= 80) System.out.println("your grade is : A");
            else if (grade >= 70) System.out.println("your grade is : B");
            else if (grade >= 60) System.out.println("your grade is : C");
        }
        else System.out.println("your grade is : F");

    }
}
