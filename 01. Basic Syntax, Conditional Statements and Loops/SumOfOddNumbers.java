import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 200; i = i + 2){
            counter++;
            sum +=i;
            System.out.println(i);

            if (counter == num){
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
