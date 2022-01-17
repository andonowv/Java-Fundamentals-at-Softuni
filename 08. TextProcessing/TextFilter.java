import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] banWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (int i = 0; i < banWords.length; i++) {
            String replacement = generateReplacement(banWords[i].length());
            text = text.replace(banWords[i], replacement);
        }
        System.out.println(text);
    }

    public static String generateReplacement(int wordLength) {

        String [] parts = new String[wordLength];

        for (int i = 0; i < wordLength; i++) {
            parts[i] = "*";
        }
        return String.join("", parts);
    }
}
