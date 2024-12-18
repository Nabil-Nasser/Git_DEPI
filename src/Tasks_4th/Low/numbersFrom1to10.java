package Tasks_4th.Low;

public class numbersFrom1to10 {
    public static void main(String[] args) {

        int i=1;
        //for loop
        for (i=1;i <= 10; i++){ System.out.print(i + " ");}

        System.out.println('\n'+"*********************************");

        //while loop
        i=1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println('\n'+"*********************************");

        //do while loop
        i=1;
        do {
            System.out.print(i+ " ");
            i++;
        }while (i<= 10);

    }

}
