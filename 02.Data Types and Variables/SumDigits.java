import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0; //сума на цифрите
        while (number != 0) {
            int lastDigit = number % 10; //последната цифра
            sum += lastDigit;
            number = number / 10; // number /= 10
        }

        System.out.println(sum);


    }
}
