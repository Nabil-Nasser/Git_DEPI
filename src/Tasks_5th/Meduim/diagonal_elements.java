package Tasks_5th.Meduim;

public class diagonal_elements {
    public static void main(String[] args) {

        //diagonal elements of a square matrix
        int [][] mat = { {1,3,5}, {2,4,6}, {9,7,8} };

        System.out.print("elements of diagonal are :");
        for (int i = 0; i <= mat.length-1; i++) {
//            if (i>0) System.out.println();
            for (int j = 0; j <= mat[i].length-1; j++) {
                if (i==j){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }

    }
}
