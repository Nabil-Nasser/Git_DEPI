package Fifty_Questions.Methods;

public class Armstrong {

    public static void armstrong(int n)
    {
        String str_int = Integer.toString(n);
        int len = str_int.length();

        int[] arr = new int[len];

        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = (str_int.charAt(i)-48);
        }

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]);
        }

        int real_len = arr.length;

        int arm = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            arm+= Math.pow(arr[i],real_len);
        }

        if (arm == n) System.out.println("Armstrong");
        else System.out.println("Not armstrong");


    }


    public static void main(String[] args) {

        armstrong(370);
    }
}
