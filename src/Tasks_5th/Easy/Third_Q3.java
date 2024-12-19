package Tasks_5th.Easy;

public class Third_Q3 {
    public static void main(String[] args) {

        //Q: Write a program to traverse a single-dimensional array using a for loop and print its elements.


        int array[] = {7,8,9,5,3,6,3,5};
        //program to traverse a single-dimensional array using a for loop and print its elements.== عبور  access

        System.out.print("The elements of the array : { ");
        for (int i = 0; i <= array.length-1 ; i++) {
         if (i != array.length-1) System.out.print(array[i]+", ");
         else System.out.print(array[i]);
        }
        System.out.print(" }");

    }
}
