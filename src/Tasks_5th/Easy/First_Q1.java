package Tasks_5th.Easy;

public class First_Q1 {
    public static void main(String[] args) {

        //Q1 :declare and initialize a single-dimensional array with five integers.
        int[] array = new int[5];

        for (int i = 0; i <= array.length-1; i++) {
            array[i] = i+1;
        }

        System.out.print("The elements of the array : { ");
        for (int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("}");
    }
}
