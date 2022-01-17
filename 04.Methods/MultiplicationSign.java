import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printWhetherIsPositiveOrNot(first, second, third);
    }

    private static void printWhetherIsPositiveOrNot(int first, int second, int third) {
        boolean isPositive = false;

        int res = first * second * third;

        if (res<0){
            System.out.println("negative");
        } else if (res > 0){
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}
