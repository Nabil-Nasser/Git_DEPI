package Tasks_5th.Hard;

public class common_elements {

    public static void main(String[] args) {

        int[] arr1 = {5,7,3,1,2};

        int[] arr2 = {6,9,1,4,0};

        for (int i = 0; i <= arr1.length-1; i++) {
            for (int j = 0; j <= arr2.length-1; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println("common element is "+ arr1[i]);
                }
            }
        }
    }
}
