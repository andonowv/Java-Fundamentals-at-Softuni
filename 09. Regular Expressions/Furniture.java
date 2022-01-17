import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List <String> furniture = new ArrayList<>();
        Double finalPrice = 0.0;
        while (!input.equals("Purchase")){

            Pattern regex = Pattern.compile(">>(?<furniture>\\w+)<<(?<price>\\d+\\.?\\d+)\\!(?<qiantity>\\d+)");
            Matcher matcher = regex.matcher(input);


            while (matcher.find()){
                String typeFur = matcher.group("furniture");
                Double price = Double.parseDouble(matcher.group("price"));
                Double qantity = Double.parseDouble(matcher.group("qiantity"));
                finalPrice += price * qantity;
                furniture.add(typeFur);
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (int i = 0; i < furniture.size(); i++) {
            System.out.printf("%s", furniture.get(i));
            System.out.println();
        }
        System.out.printf("Total money spend: %.2f", finalPrice);
    }
}
