import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String midCharacter = mid (input);

        System.out.println(midCharacter);
    }

    private static String mid(String input) {
        int length = input.length();
        String mid = " ";
        char midLetter = ' ';
        if (length % 2 == 1){
            midLetter = input.charAt(input.length()/2);
            mid += midLetter;
        } else {
            midLetter = input.charAt(input.length()/2 -1);
            mid+=midLetter;
            midLetter = input.charAt(input.length()/2);
            mid+=midLetter;
        }
        return mid;

    }
}
