package Fifty_Questions.Conditions;

public class Electricity_bill {

    public static void main(String[] args) {

        double usage_in_this_month = 380.6;  //Consumption amount. (new reading - old reading)

        int rate = 5; // category = 1|2|3|4|5|6|7 ..

        double value_of_bill = 0.0;

        if (usage_in_this_month <= 50 && rate <= 2)
        {
            value_of_bill = usage_in_this_month*0.48 + (rate*20);
        }

        if (usage_in_this_month <= 100 && ( rate <= 4 && rate > 2 ) )
        {
            value_of_bill = (usage_in_this_month*0.58) + (rate*30);
        }

        if (usage_in_this_month <= 500 && ( rate <= 4 && rate > 2 ) )
        {
            value_of_bill = (usage_in_this_month*0.58) + (rate*40);
        }

        if (usage_in_this_month <= 900 && ( rate <= 7 && rate > 4 ) )
        {
            value_of_bill = (usage_in_this_month*0.88) + (rate*70);
        }

        System.out.println("Total bill value = " + value_of_bill);

    }
}
