import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 200; i = i +2) {
            counter++;

            System.out.print(i);
            System.out.println();
            sum += i;
            if (counter == n){
                break;
            }
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
