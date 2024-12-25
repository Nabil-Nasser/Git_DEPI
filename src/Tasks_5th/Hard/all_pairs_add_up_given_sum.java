package Tasks_5th.Hard;

public class all_pairs_add_up_given_sum {

    public static void main(String[] args) {

        int sum = 10;

        int [] arr = {8,3,9,6,7,1,5,2};

        for (int i = 0; i <= (arr.length-1)/2; i++) {
            for (int j = 0; j <= arr.length-1; j++) {
                if(arr[i]+arr[j] == sum && i!=j){
                    System.out.print(arr[i]+" + "+arr[j]);
                    System.out.print(" = "+ sum+"\n");
                }
            }
        }

    }
}
