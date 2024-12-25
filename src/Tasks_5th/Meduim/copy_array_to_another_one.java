package Tasks_5th.Meduim;

public class copy_array_to_another_one {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        int len = arr.length;

        int[] arr2 = new int[len];

        for (int i = 0; i <= arr.length-1; i++) {
            arr2[i] = arr[i];
        }

        System.out.print("The Copied array: [");
        for (int i = 0; i <= arr2.length-1; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.print("]");
    }
}
