import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide = Integer.parseInt(scanner.nextLine());
        int secondSide = Integer.parseInt(scanner.nextLine());

        int area = rectangleArea (firstSide, secondSide);
        System.out.printf("%d", area);
    }

    private static int rectangleArea(int firstSide, int secondSide) {
        return firstSide*secondSide;
    }
}
