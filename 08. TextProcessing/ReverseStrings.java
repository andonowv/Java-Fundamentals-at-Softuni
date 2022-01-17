import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedWord = "";
        char currentWord = ' ';

        while (!input.equals("end")){
            for (int i = input.length() -1; i >= 0; i--){
                currentWord = input.charAt(i);
                reversedWord += currentWord;
            }
            System.out.printf("%s = %s\n", input, reversedWord);
            reversedWord = "";
            input = scanner.nextLine();
        }
    }
}
