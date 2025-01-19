package Fifty_Questions.Arrays;

public class two_arrays_are_equal {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        String flag = "0";

        for (int i = 0; i <= arr1.length-1; i++) {
                if (arr1[i] == arr2[i]) flag+="t";
                else flag+="f";
        }

        if (flag.contains("f")){
            System.out.println("Two Arrays aren't equal");
        }
        //so arr1[0]=arr2[0] && arr1[1]=arr2[1] and so on..
        else System.out.println("Two Arrays are Equal");


    }
}
