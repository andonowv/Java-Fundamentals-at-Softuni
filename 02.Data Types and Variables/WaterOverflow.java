import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int pouringTheTank = 0;
        for (int i = 0; i < count; i++){
            pouringTheTank = Integer.parseInt(scanner.nextLine());
            sum+= pouringTheTank;
            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -=pouringTheTank;
            }

        }
        System.out.println(sum);
    }
}
