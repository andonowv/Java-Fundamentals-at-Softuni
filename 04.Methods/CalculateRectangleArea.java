import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        area(a,b);
    }

    private static void area(int a, int b) {
        double res = a * b;
        System.out.printf("%.0f",res);
    }
}
