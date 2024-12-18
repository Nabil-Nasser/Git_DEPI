package Tasks_4th.meduim;

public class numFrom1To50DivBy3_5 {
    public static void main(String[] args) {

        System.out.print("Numbers From 1 to 50 That Are Divisible by 3 and 5 :");
        for (int i = 1; i <= 50; i++) {
            if (i%3 == 0 && i%5 ==0) System.out.print(i+" ");
        }
    }
}
