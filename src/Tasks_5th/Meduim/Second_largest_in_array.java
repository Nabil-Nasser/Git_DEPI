package Tasks_5th.Meduim;

public class Second_largest_in_array {
    public static void main(String[] args) {

        int arr[] = {9,7,2,10,5,11,1,8};
        int big = arr[0];

        //extract biggest element
        for (int i = 0; i <= arr.length-1 ; i++) {
            if (arr[i] > big) big = arr[i];
        }

        System.out.println("biggest element :"+big);
        int index;

        //index of biggest element
        for (int i = 0; i <= arr.length-1 ; i++) {
           if(arr[i]== big) { index=i; return;}

        }
//        // delete the biggest element
//        for (int i = 0, k=0; i <= arr.length-1 ; i++) {
//            if (arr[i]!=index)
//                arr[k]=arr[i];
//        }
        //check the array (without biggest element)
        System.out.println("NEW :");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
