import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char letter = ' ';

        for (int i = input.length() -1; i >= 0; i--){
            letter = input.charAt(i);
            System.out.printf("%c", letter);
        }

    }
}
