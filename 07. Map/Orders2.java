import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map <String, Double> productAndPrice = new LinkedHashMap<>();
        Map <String, Double> productAndQua = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] elements = input.split(" ");
            String product = elements [0];
            double price = Double.parseDouble(elements[1]);
            double quantity = Double.parseDouble(elements[2]);

            if (!productAndPrice.containsKey(product)){
                productAndPrice.put(product, price);
            } else {
                productAndPrice.put(product, price);
            }
            if (!productAndQua.containsKey(product)){
                productAndQua.put(product, quantity);
            }else {
                productAndQua.put(product,productAndQua.get(product) + quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry: productAndPrice.entrySet()) {
            double result = productAndPrice.get(entry.getValue()) * productAndQua.get(entry.getValue());
            System.out.println(result);
        }

    }
}
