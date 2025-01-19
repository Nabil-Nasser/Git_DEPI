package Fifty_Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class Second_largest_element {

    public static void main(String[] args) {

        int[] arr = {4,10,5,14,1,13,15};
        int max = arr[0];


        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) max= arr[i];
        }

        //System.out.println("max = " + max);

        int[] arr_after_delete_max = new int[arr.length-1];

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]==max && i!=arr.length-1)
            {
                arr[i]=arr[i+1];
                arr[i+1]=arr[i+2];
                arr[i+2]=arr[i+3];
            }
            if (arr[i]==max && i==arr.length-1)
            {
                arr[i]=0;
            }
        }

        for (int i = 0; i <= arr.length-2; i++) {
            arr_after_delete_max[i]=arr[i];
        }

//        System.out.print("After Deletion: ");
//        for (int i = 0; i <= arr_after_delete_max.length-1; i++) {
//            System.out.print(arr_after_delete_max[i]+" ");
//        }

        int sec_max = arr_after_delete_max[0];

        for (int i = 0; i <= arr_after_delete_max.length-1; i++) {
            if (arr_after_delete_max[i] > sec_max) sec_max = arr_after_delete_max[i];
        }
       // System.out.println();

        System.out.println("Sec max = "+ sec_max);

    }
}
