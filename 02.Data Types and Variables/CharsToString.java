import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = "";
        String word = "";

        for (int i =0; i < 3; i++){
            word += scanner.nextLine();
        }

        System.out.println(word);
    }
}
