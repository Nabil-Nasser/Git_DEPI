package Tasks_5th.Easy;

public class Eight_Q8 {
    public static void main(String[] args) {
        //Q: Declare a 2D array and initialize it with a 3x3 matrix. Print all its elements.
        int[][] matrix = {  {1,2,4}, {5,6,7}, {7,3,9} };

        System.out.println("the matrix is: ");
        for (int i = 0; i <= matrix.length-1; i++) {
            if(i > 0) System.out.println();
            for (int j = 0; j <= matrix.length-1 ; j++) {
                System.out.print("\t"+matrix[i][j]+" ");
            }
        }
    }
}
