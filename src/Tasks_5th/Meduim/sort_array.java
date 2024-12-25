package Tasks_5th.Meduim;

public class sort_array {
    public static void main(String[] args) {

        //Quick Sort
        //wanna sort in ascending order

        int[] arr = {4,3,8,9,5,1,7};

        int i;
        int low=0;
        int pivot_item = arr[low];
        int j = low;

        for (i = 1; i <= arr.length-1 ; i++) {
            if(arr[i] < pivot_item){
                j++;
                arr[j]=arr[i];
            }
        }
        int pivot_point = j;
        arr[low] = arr[pivot_point];


        System.out.print("sorted array: [");
        for (int k = 0; k <= arr.length-1; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.print("]");
    }
}
