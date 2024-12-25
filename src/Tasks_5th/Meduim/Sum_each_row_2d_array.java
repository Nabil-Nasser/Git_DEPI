package Tasks_5th.Meduim;

public class Sum_each_row_2d_array {
    public static void main(String[] args) {

      int[][] array = { {1,3,4}, {2,4,5}, {6,7,8} , {1,3,5} };
        int sum= 0;

        for (int i = 0; i <= array.length-1; i++) {
            System.out.print("sum of elements in row "+(i+1));
            for (int j = 0; j <= array[i].length-1; j++) {
                sum+=array[i][j];
            }
            System.out.print(" is "+sum+"\n");
            sum = 0;
        }
    }
}
