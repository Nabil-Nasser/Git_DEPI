package Fifty_Questions.Methods;

public class sum_elements_in_array {

    public static void sum_elements_in_array(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            sum+=arr[i];
        }
        System.out.println("The Sum Of The Elements in the array = "+sum);
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,6,7};

        sum_elements_in_array(arr1);
    }
}
