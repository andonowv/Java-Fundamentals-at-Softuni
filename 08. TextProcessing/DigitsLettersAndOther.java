import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char letter = ' ';

        List <Character> numbers = new ArrayList<>();
        List <Character> text = new ArrayList<>();
        List <Character> others = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            if (Character.isDigit(letter)){
                numbers.add(letter);
            } else if (Character.isLetter(letter)){
                text.add(letter);
            } else {
                others.add(letter);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%c", numbers.get(i));
        }
        System.out.println();
        for (int i = 0; i < text.size(); i++) {
            System.out.printf("%c", text.get(i));
        }
        System.out.println();
        for (int i = 0; i < others.size(); i++) {
            System.out.printf("%c", others.get(i));
        }
    }
}
