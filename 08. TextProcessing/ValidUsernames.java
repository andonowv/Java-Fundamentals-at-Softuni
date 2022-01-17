import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] userNames = scanner.nextLine().split(", ");
        Character currentLetter = ' ';
        boolean isValid = false;

        for (int i = 0; i < userNames.length; i++) {
            for (int j = 0; j < userNames[i].length(); j++) {
                currentLetter = userNames[i].charAt(j);
                if (Character.isLetter(currentLetter) ||
                Character.isDigit(currentLetter) ||
                currentLetter.equals('-') ||
                currentLetter.equals('_')){
                    if (userNames[i].length() >= 3 && userNames[i].length() <= 16){
                        isValid = true;
                    }
                }else {
                    isValid = false;
                    break;
                }
            }
            if (isValid){
                System.out.printf("%s", userNames[i]);
                System.out.println();
            }
            isValid = false;
        }
    }
}
