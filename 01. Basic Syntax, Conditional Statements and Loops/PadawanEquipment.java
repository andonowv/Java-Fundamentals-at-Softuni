import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = 0;

        double moneyInCash = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double freeBelts = countStudents - (countStudents / 6);
        double countLight = countStudents + Math.ceil(countStudents * 0.10);
        neededMoney = countLight * priceOfLightsabers + priceOfRobes * countStudents + freeBelts * priceOfBelts;


        if (neededMoney < moneyInCash){
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        } else {
            double diff = neededMoney - moneyInCash;
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
