import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double moneyInCash = 0;
        double money = 0;
        String purchase = "";

        while (!input.equals("Start")){
            money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                moneyInCash +=money;
            }else {
                System.out.printf("Cannot accept %.2f", money);
                System.out.println();
            }
            input = scanner.nextLine();
        }
        purchase = scanner.nextLine();
        while (!purchase.equals("End")){
            if (purchase.equals("Nuts")){
                if (moneyInCash - 2 >= 0){
                    System.out.println("Purchased Nuts");
                    moneyInCash -=2;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (purchase.equals("Water")){
                if (moneyInCash - 0.7 >= 0){
                    System.out.println("Purchased Water");
                    moneyInCash -= 0.7;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (purchase.equals("Crisps")) {
                if (moneyInCash - 1.5 >= 0) {
                    System.out.println("Purchased Crisps");
                    moneyInCash -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (purchase.equals("Soda")) {
                if (moneyInCash - 0.8 >= 0) {
                    System.out.println("Purchased Soda");
                    moneyInCash -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            else if (purchase.equals("Coke")){
                if (moneyInCash - 1 >= 0) {
                    System.out.println("Purchased Coke");
                    moneyInCash -= 1;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            purchase = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneyInCash);

    }
}
