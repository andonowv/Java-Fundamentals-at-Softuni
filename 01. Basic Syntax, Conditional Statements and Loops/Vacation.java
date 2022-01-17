import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        String typeGr = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (day.equals("Friday")){
            if (typeGr.equals("Students")){
                price = 8.45;
            } else if (typeGr.equals("Business")){
                price = 10.90;
            } else if (typeGr.equals("Regular")){
                price = 15;
            }
        }
        else if (day.equals("Saturday")){
            if (typeGr.equals("Students")){
                price = 9.80;
            } else if (typeGr.equals("Business")){
                price = 15.60;
            } else if (typeGr.equals("Regular")){
                price = 20;
            }
        }
        else if (day.equals("Sunday")){
            if (typeGr.equals("Students")){
                price = 10.46;
            } else if (typeGr.equals("Business")){
                price = 16;
            } else if (typeGr.equals("Regular")){
                price = 22.50;
            }
        }
        totalPrice = price * countGroup;

        if (typeGr.equals("Students") && countGroup >=30){
            totalPrice *=0.85;
        } else if (typeGr.equals("Business") && countGroup >= 100){
            totalPrice = price * (countGroup - 10);
        } else if (typeGr.equals("Regular") && countGroup >=10 && countGroup <= 20){
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
