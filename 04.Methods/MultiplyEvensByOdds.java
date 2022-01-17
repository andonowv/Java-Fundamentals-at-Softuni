import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getMultiply(num);
        System.out.println(result);
    }

    private static int getMultiply(int num) {
        int lastDigit = 0;
        int sumEven=0;
        int sumOdd = 0;
        while (num!=0){
            lastDigit = num % 10;
            if (lastDigit % 2 == 0){
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }
            num /=10;
        }
        int result = sumEven * sumOdd;
        return result;
    }
}
