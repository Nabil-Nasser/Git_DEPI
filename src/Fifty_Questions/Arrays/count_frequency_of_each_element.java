package Fifty_Questions.Arrays;

public class count_frequency_of_each_element {
    public static void main(String[] args) {

        int[] arr = {1,1,3,4,4,5,6,8,8,8,9,0};


//      int[] arr = {1,1,3,4,4,5,6,8,8,8,9,0};

        //iterator
        int count = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr.length-1; j++) {
                if (arr[i]==arr[j]){  count++; }
            }

            System.out.println("number "+arr[i]+" repeated "+ count + " times");

            //if ((arr[i]==arr[i+1])) i++;

            count = 0;//to avoid adding(consider) the repeat of the previous elements
        }
    }
}
