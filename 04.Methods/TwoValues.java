import java.util.Scanner;

public class TwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int result = intMax (firstNum,secondNum);
                System.out.println(result);
                break;
            case "char":
                char firstLetter = scanner.nextLine().charAt(0);
                char secondLetter = scanner.nextLine().charAt(0);
                char biggerChar = charMax(firstLetter, secondLetter);
                System.out.println(biggerChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String biggerString = maxString(firstString,secondString);
                System.out.println(biggerString);
                break;
        }
    }

    private static String maxString(String firstString, String secondString) {
        if (firstString.length() > secondString.length()){
            return firstString;
        }else {
            return secondString;
        }
    }

    private static char charMax(char firstLetter, char secondLetter) {
        if ((int)firstLetter > (int) secondLetter){
            return firstLetter;
        }else {
            return secondLetter;
        }
    }

    private static int intMax(int firstNum, int secondNum) {
        if (firstNum > secondNum){
            return firstNum;
        }else {
            return secondNum;
        }
    }
}
