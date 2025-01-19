package Fifty_Questions.Arrays;

public class Smallest_element {

    public static void main(String[] args) {


        int[] arr = {3,4,1,9,2,0};

        int small = arr[0];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < small) small = arr[i];
        }
        System.out.println("The Smallest number is : "+ small);
    }
}
