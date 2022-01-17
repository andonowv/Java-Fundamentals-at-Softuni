import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char currentLetter = ' ';
        StringBuilder finalResult = new StringBuilder();
        currentLetter = input.charAt(0);
        finalResult.append(currentLetter);
        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) != input.charAt(i -1)){
                finalResult.append(input.charAt(i));
            }
        }
        System.out.println(finalResult);
    }
}
