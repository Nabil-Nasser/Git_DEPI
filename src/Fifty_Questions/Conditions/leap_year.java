package Fifty_Questions.Conditions;

public class leap_year {

    public static void main(String[] args) {

        //if feb = 29 days >> the # of days in this year = 366 days !!
        int Number_of_days_in_Feb = 29;

        if (Number_of_days_in_Feb > 28) System.out.println("This is a leap year.");
        else System.out.println("Not a leap year.");


    }
}
