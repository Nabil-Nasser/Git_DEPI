package Tasks_5th.Easy;

public class Ninth_Q9 {
    public static void main(String[] args) {

        //Q: Write a program to find the maximum element in a single-dimensional array.

        int[] array = {4,5,7,8,2,1,12};
        //just assume that the 1st element is tha maximum one
        int max = array[0];

        for (int i = 0; i <= array.length-1; i++) {
                if (array[i] > max) max = array[i];
        }
        System.out.println("The maximum element in the array is: "+max);
    }
}
