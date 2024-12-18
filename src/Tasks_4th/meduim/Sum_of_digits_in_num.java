package Tasks_4th.meduim;

public class Sum_of_digits_in_num {
    public static void main(String[] args) {

        int num= 1024;
        int sum = 0;
        String str_num = Integer.toString(num);
        for (int i = 0; i <= str_num.length()-1; i++) {
           sum += Integer.parseInt(String.valueOf(str_num.charAt(i)));
        }
        System.out.println(sum);
    }
}
