import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double spend = 0;
        String command = scanner.nextLine();

        while (!command.equals("Game Time")){
            if (command.equals("OutFall 4")){
                if (balance >= 39.99){
                    System.out.println("Bought OutFall 4");
                    balance -= 39.99;
                    spend += 39.99;
                }else {
                    System.out.println("Too Expensive");
                }
            }else if (command.equals("CS: OG")){
                if (balance >= 15.99){
                    System.out.println("Bought CS: OG");
                    balance -= 15.99;
                    spend += 15.99;
                }else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("Zplinter Zell")){
                if (balance >= 19.99){
                    System.out.println("Bought Zplinter Zell");
                    balance -= 19.99;
                    spend += 19.99;
                }else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("Honored 2")){
                if (balance >= 59.99){
                    System.out.println("Bought Honored 2");
                    balance -= 59.99;
                    spend += 59.99;
                }else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("RoverWatch")){
                if (balance >= 29.99){
                    System.out.println("Bought RoverWatch");
                    balance -= 29.99;
                    spend += 29.99;
                }else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("RoverWatch Origins Edition")){
                if (balance >= 39.99){
                    System.out.println("Bought RoverWatch Origins Edition");
                    balance -= 39.99;
                    spend += 39.99;
                }else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (balance == 0){
                System.out.println("Out of money!");
                return;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, balance);
    }
}
