package Fifty_Questions.Arrays;

public class reverse_array {
    public static void main(String[] args) {

        int[] arr = {2,4,6,3,7,9};

        int[] arr_reversed = new int[arr.length];

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                arr_reversed[j] = arr[i];
            }
        }

        System.out.print("The array after reversed : ");
        for (int i = 0; i <= arr_reversed.length-1; i++) {
            System.out.print(arr_reversed[i]+" ");
        }
    }
}