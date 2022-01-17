import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Integer.parseInt(scanner.nextLine());
        double km = meters * 0.001;

        System.out.printf("%.2f", km);
    }
}
