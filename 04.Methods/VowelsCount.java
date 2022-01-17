import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum =  vowelsCount (input);
        System.out.println(sum);
    }

    private static int vowelsCount(String input) {
        char letter = ' ';
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            letter = input.charAt(i);
            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'y' || letter == 'u' || letter == 'i' || letter == 'A' || letter == 'O' || letter == 'E' || letter == 'Y' || letter == 'U' || letter == 'I') {
                sum += 1;
            }
        }
        return sum;
    }
}
