package Fifty_Questions.Arrays;

public class merge_two_arrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,3,6,5};
        int[] arr2 = {7,9,8,10,0,11};

        int[] arr = new int[arr1.length+ arr2.length];


            for (int i = 0; i <= arr1.length-1; i++) {
                arr[i]= arr1[i];
            }
            for (int j = 0; j <= arr2.length-1; j++) {
                arr[arr1.length+j] = arr2[j];
            }


        System.out.print("The New Array after merging the two sub array is : { ");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");

    }
}
