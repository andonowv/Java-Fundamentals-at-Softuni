import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char currentLetter = ' ';
        char newLetter = ' ';
        int ascii = 0;
        String output = " ";

        for (int i = 0; i < input.length(); i++) {
            currentLetter = input.charAt(i);
            ascii = (int) currentLetter + 3;
            newLetter = (char) ascii;
            output +=newLetter;
        }
        System.out.println(output);
    }
}
