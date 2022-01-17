import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        printWord (word, count);
    }

    private static void printWord(String word, int count) {
        for (int i = 0; i < count; i++){
            System.out.printf("%s", word);
        }
    }
}
