import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int smaller = getSmaller (first,second,third);
        System.out.println(smaller);
    }

    private static int getSmaller(int first, int second, int third) {
        int firstSmaller = Math.min(first,second);
        int secondSmaller = Math.min(firstSmaller, third);
        return secondSmaller;
    }
}
