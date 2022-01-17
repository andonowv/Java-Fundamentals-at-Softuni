import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffee (quantity);
                break;
            case "water":
                water (quantity);
                break;
            case "coke":
                coke(quantity);
                break;
            case "snacks":
                snacks(quantity);
                break;
        }
    }

    private static void snacks(int quantity) {
        double price = 2 * quantity;
        System.out.printf("%.2f", price);
    }

    private static void coke(int quantity) {
        double price = 1.40 * quantity;
        System.out.printf("%.2f", price);
    }

    private static void water(int quantity) {
        double price = 1 * quantity;
        System.out.printf("%.2f", price);
    }

    private static void coffee(int quantity) {
        double price = 1.50 * quantity;
        System.out.printf("%.2f", price);
    }
}
