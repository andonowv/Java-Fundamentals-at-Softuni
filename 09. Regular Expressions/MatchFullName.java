import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern regex = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+");

        Matcher matcher = regex.matcher(text);
        while (matcher.find()){
            System.out.printf("%s ", matcher.group());
        }
    }
}
