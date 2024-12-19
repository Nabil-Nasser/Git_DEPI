package Tasks_5th.Easy;

public class Fourth_Q4 {
    public static void main(String[] args) {

        //Q: How do you assign values to an array using an initializer list? Provide an example.
        int arr[] = {3,4,5,6,7,8,9};

        int arr2[]= new int[arr.length];
        //assign values by initializer list
        for (int i = 0; i <= arr2.length-1; i++) {
            arr2[i] = arr[i];
        }

        System.out.print("The elements of the array : { ");
        for (int i = 0; i <= arr2.length-1 ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.print("}");

    }
}
