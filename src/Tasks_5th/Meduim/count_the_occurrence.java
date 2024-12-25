package Tasks_5th.Meduim;

public class count_the_occurrence {
    public static void main(String[] args) {

        int[] arr = {2,2,4,5,6,6,6,6,7,7,7};
        String flag = "0";

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 1; j <= arr.length-1; j++) {
                if (arr[i] == arr[j]) flag+="t";
                else flag+="f";
            }
//            System.out.print(flag);
////            System.out.println(flag.contains("t")?"not palindrome": "palindrome");
        }
    }
}
