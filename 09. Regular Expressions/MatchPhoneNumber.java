import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tel = scanner.nextLine();
        Pattern regex = Pattern.compile("\\+359([\\- ])2(\\1)\\d{3}(\\1)\\d{4}\\b");
        Matcher matcher = regex.matcher(tel);
        List <String> telephones = new ArrayList<>();
        while (matcher.find()){
            telephones.add(matcher.group());
        }

        System.out.println(telephones.toString().replaceAll("[\\[\\]]", ""));
    }
}
