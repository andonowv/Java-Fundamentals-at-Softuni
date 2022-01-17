import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int a = 97; a < 97 + num; a++){
            for (int b = 97; b < 97 + num; b++){
                for (int c = 97; c < 97 + num; c++){
                    System.out.printf("%c%c%c", (char)a, (char)b, (char)c);
                    System.out.println();
                }
            }
        }
    }
}
