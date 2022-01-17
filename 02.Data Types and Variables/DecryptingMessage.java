import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diff = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        String word = "";
        char letter = ' ';

        for (int i=0; i < count; i++){
            letter = scanner.nextLine().charAt(0);
            letter = (char)(letter+diff);
            word+=letter;
        }
        System.out.println(word);
    }
}
