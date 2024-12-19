package Tasks_5th.Easy;

public class Tenth_Q10 {
    public static void main(String[] args) {

        //Q: How do you reverse the elements of an array? Write a simple program.
        int array[] = {1,2,3,4,5,6};

        //How do you reverse the elements of an array?

        System.out.print("The elements of the array before reversing : { ");
        for (int i = 0; i <= array.length-1 ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("}");

        for (int i = 0; i <= (array.length-1)/2 ; i++) {
            int temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
        }

        System.out.println("\n"+"\t"+"\t"+"***********************************");

        System.out.print("The elements of the array after reversing : { ");
        for (int i = 0; i <= array.length-1 ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("}");
    }
}
