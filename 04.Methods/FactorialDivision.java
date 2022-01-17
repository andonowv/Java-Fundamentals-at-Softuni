import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());

        double firstFact =  factorial (first);
        double secondFact = factorial (second);
        double res = firstFact / secondFact;
        System.out.printf("%.2f", res);
    }

    private static double factorial(double first) {
        long res = 1;
        for (double i = first; i > 0; i--){
            res *= i;
        }
        return res;
    }
}
