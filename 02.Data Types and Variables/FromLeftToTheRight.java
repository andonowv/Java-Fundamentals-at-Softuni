import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001d;
        Boolean isTrue = (Math.abs(num1 - num2) <= eps);
        //Boolean isFalse = (Math.abs(num1 - num2) > eps);
        if (isTrue) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}

