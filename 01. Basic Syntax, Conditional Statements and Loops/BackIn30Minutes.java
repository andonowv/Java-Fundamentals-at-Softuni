import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int input = hours * 60 + min;
        int output = input + 30;

        int hOutput = output / 60;
        int minOutput = output % 60;

        if (hOutput == 24){
            hOutput = 0;
        }

        if (minOutput < 10){
            System.out.printf("%d:0%d", hOutput, minOutput);
        }else {
            System.out.printf("%d:%d", hOutput, minOutput);
        }


    }
}
