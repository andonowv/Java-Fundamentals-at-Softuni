import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double res = result(a,b);

        System.out.println(new DecimalFormat("0.####").format(res));
    }

    private static double result(double a, double b) {
        double res = Math.pow(a,b);
        return res;
    }
}
