package Tasks_5th.Meduim;

public class multiply_2D_arrays {
    public static void main(String[] args) {
        
        int[][] arr1 = {  {1,2},
                          {4,5} }; //2x2

        int[][] arr2 = {  {5,1},
                          {2,3} }; //2x2 >> arr1 x arr2 > arr3[2][2]

        int [][] arr3 = new int[2][2];

        for (int i = 0; i <= arr1.length; i++) {

            for (int j = 0; j <= arr2.length; j++) {
                arr3[i][j] = ( arr1[i][j] * arr2[i][j] ) + ( arr1[i][j+1] * arr2[i+1][j] );
                System.out.print(arr3[i][j]+" ");
            }
        }

        for (int i = 0; i <= arr3.length-1; i++) {
            if (i==1) System.out.println();
            for (int j = 0; j <= arr3.length-1 ; j++) {
            }
        }

    }
}
