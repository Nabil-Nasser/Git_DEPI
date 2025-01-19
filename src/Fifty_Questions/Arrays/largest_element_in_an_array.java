package Fifty_Questions.Arrays;

public class largest_element_in_an_array {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6,8};

        int large_num = arr[0];


        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > large_num ) large_num = arr[i];
        }
        System.out.println("The largest Number is : "+ large_num);

    }
}
