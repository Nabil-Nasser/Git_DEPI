package Tasks_5th.Hard;

public class row_max_sum {
    public static void main(String[] args) {

        int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
        int[] sum = new int[3];

        for (int i = 0; i <= arr.length-1; i++) {
             System.out.print("sum of row "+(i+1)+" is: ");
            for (int j = 0; j < arr[i].length-1 ; j++) {
                sum[i]+=arr[i][j];
            }
                System.out.print(sum+"\n");
        }

        int max_sum = sum[0];
        for (int i = 0; i <= sum.length-1; i++) {
            if (sum[i] > max_sum) max_sum = sum[i];
            System.out.println("The row in position "+(i+1)+ "has the max sum");return;
        }

    }
}
