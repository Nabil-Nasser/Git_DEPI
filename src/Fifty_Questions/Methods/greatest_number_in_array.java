package Fifty_Questions.Methods;

public class greatest_number_in_array {


    public static void greatest_number(int[] arr)
    {
        int max=arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) max= arr[i];
        }

        System.out.println("The Greatest Number In An Array = " + max);
    }


    public static void main(String[] args) {

        int[] arr1 = {90,98,99,89,100,200,300,94};
        greatest_number(arr1);
    }
}
