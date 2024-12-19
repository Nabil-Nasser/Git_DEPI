package Tasks_5th.Easy;

public class Seventh_Q7 {
    public static void main(String[] args) {

        // Q: Write a program to calculate the sum of all elements in an integer array.
        int [] array = {3,4,5,6,2,7,8,9};

        //to calc the value of the elements
        int sum = 0;

        System.out.print("The sum of the elements of the array is : ");
        for (int i = 0; i <= array.length-1 ; i++) {
            sum+=array[i];
        }
        System.out.println(sum);



    }
}
