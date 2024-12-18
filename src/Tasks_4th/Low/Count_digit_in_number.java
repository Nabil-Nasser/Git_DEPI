package Tasks_4th.Low;

public class Count_digit_in_number {
    public static void main(String[] args) {

        int num = 000;
        String num_str = String.valueOf(num);
        int length = num_str.length();

        switch (length){
        case 1: System.out.println("1 digits"); break;
        case 2: System.out.println("2 digits"); break;
        case 3: System.out.println("3 digits"); break;
        case 4: System.out.println("4 digits"); break;
        case 5: System.out.println("5 digits"); break;
        case 6: System.out.println("6 digits"); break;
        case 7: System.out.println("7 digits"); break;
            default:
                System.out.println("invalid input");


        }
    }
}
