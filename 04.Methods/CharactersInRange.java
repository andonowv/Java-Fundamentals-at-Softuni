import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        ascii (start,second);
    }

    private static void ascii(char start, char second) {
        if ((char)start < (char)second){
            for (int i = (char)start + 1; i < (char)second; i++){
                char letter = (char)i;
                System.out.printf("%c ", letter);
            }
        } else {
            for (int i = (char)second + 1; i < (char)start; i++){
                char letter = (char)i;
                System.out.printf("%c ", letter);
        }
    }
}}
