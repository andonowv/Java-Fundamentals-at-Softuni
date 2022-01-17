import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ordersvol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, Double> products = new LinkedHashMap<>();
        products.put("coffee", 1.50);
        products.put("water", 1.00);
        products.put("coke", 1.40);
        products.put("snacks", 2.00);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = finalPrice(product, quantity, products.get(product));
        System.out.printf("%.2f", price);
    }

    private static double finalPrice(String product, int quantity, Double aDouble) {

        double finalPrice = quantity * aDouble;
        return finalPrice;
    }


}
