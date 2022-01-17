import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        passLength (input);
        letterAndDigitds (input);
        twoDigits (input);
        isValid(input);

    }

    private static void isValid(String input) {
        boolean isValid = false;
        int countDigits = 0;
        char letter = ' ';
        for (int i =0; i < input.length(); i++){
            letter = input.charAt(i);
            if (Character.isDigit(letter)){
                countDigits +=1;
            }
        }
        if (countDigits >=2){
            isValid = true;
        }
        for (int i = 0; i < input.length(); i++){
            letter = input.charAt(i);
            if (!Character.isLetter(letter)){
                if (!Character.isDigit(letter)){
                    isValid = false;
                    return;
                }
            }
        }
        if (input.length() >= 6 && input.length() <= 10){
            isValid = true;
        }
        if (isValid){
            System.out.println("Password is valid");
        }
    }

    private static void twoDigits(String input) {
        int countDigits = 0;
        char letter = ' ';
        for (int i =0; i < input.length(); i++){
            letter = input.charAt(i);
            if (Character.isDigit(letter)){
                countDigits +=1;
            }
        }
        if (countDigits <2){
            System.out.println("Password must have at least 2 digits");
            ;
        }
    }

    private static void letterAndDigitds(String input) {
        char letter = ' ';
        for (int i = 0; i < input.length(); i++){
            letter = input.charAt(i);
            if (!Character.isLetter(letter)){
                if (!Character.isDigit(letter)){
                    System.out.println("Password must consist only of letters and digits");
                    return;
                }
            }
        }
    }

    private static void passLength(String input) {
        if (input.length() < 6 || input.length() > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }
    }
}