package Tasks_5th.Meduim;

public class transpose_2D_array {

    public static void main(String[] args) {

        int[][] matrix = {  {1,3,4}, {5,6,7}, {8,9,2}  };

        int[][] trans_matrix = new int[3][3];

        for (int i = 0; i <= matrix.length-1; i++) {
            for (int j = 0; j <= matrix[i].length-1; j++) {
                trans_matrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matrix before transpose :");
        for (int i = 0; i <= matrix.length-1; i++) {
            if(i > 0) System.out.println();
            for (int j = 0; j <= matrix[i].length-1; j++) {
                System.out.print("\t"+matrix[i][j]+" ");
            }
        }


        System.out.println("\n"+"Matrix after transpose :");
        for (int i = 0; i <= matrix.length-1; i++) {
            if(i > 0) System.out.println();
            for (int j = 0; j <= matrix[i].length-1; j++) {
                System.out.print("\t"+trans_matrix[i][j]+" ");
            }
        }

    }
}
