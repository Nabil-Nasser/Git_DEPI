package Tasks_5th.Easy;

public class Sixth_Q6 {
    public static void main(String[] args) {

        //Q: What is the default value of elements in an uninitialized int array? Write code to verify.

        //default value of elements in an uninitialized int array >> 0
        int[] arr= new int[5];


        System.out.print("The elements of uninitialized array : { ");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");
    }
}
