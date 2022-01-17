import java.text.DecimalFormat;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double result = mathPower (firstNum, secondNum);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double mathPower(double firstNum, double secondNum) {
        double result = Math.pow(firstNum,secondNum);
        return  result;
    }

}
