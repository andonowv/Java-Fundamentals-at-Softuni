import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asci = (char)'a';

        int num = Integer.parseInt(scanner.nextLine());
        char letter = ' ';
        int sum =0;
        for (int i = 0; i < num; i++){

            letter = scanner.nextLine().charAt(0);
            sum += (char)letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
