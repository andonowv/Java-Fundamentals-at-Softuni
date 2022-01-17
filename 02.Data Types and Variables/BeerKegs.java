import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String keg = "";
        String bestKeg ="";
        double rad = 0;
        int height = 0;
        double res = 0;
        double bestRes = 0;

        for (int i = 0; i < count; i++){
            keg = scanner.nextLine();
            rad = Double.parseDouble(scanner.nextLine());
            height = Integer.parseInt(scanner.nextLine());

            res = Math.PI * rad * rad * height;

            if (res > bestRes){
                bestRes = res;
                bestKeg = keg;
            }

        }
        System.out.println(bestKeg);
    }
}
