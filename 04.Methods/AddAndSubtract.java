import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoInt(first,second);
        int subtract = subtractTwoNumbers(sum, third);
        System.out.println(subtract);
    }


    private static int sumTwoInt(int first, int second) {
        int sum = first + second;
        return sum;
    }
    private static int subtractTwoNumbers(int sum, int third) {
        int subtract = sum - third;
        return subtract;
    }
}
