package Tasks_5th.Meduim;

public class is_a_num_exists {
    public static void main(String[] args) {

        int []arr = {4,6,8,4,2,1,9,2};

        int target = 0;

        String flag="0";

        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == target) flag+="t";
            else flag+="f";
        }
        System.out.println(flag.contains("t")?"Your target is here ": "Sorry, your target isn't here");
    }
}
