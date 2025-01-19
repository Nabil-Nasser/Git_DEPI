package Fifty_Questions.Arrays;

public class Sum_of_elements {
    public static void main(String[] args) {

        int[] arr = {1,4,6,7,5};

        int sum = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of Elements in the array is : "+ sum);
    }
}
