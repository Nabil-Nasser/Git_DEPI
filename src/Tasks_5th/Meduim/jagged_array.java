package Tasks_5th.Meduim;

public class jagged_array {

    public static void main(String[] args) {

        int [][] mat = {  {4,5,6}, {1,4,6,7,89,5} , {1,2,56,8,6} };

        for (int i = 0; i <= mat.length-1; i++) {
            if (i>0)System.out.println();
            for (int j = 0; j <= mat[i].length-1; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}
