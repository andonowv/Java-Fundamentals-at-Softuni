import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int snowballSnow = 0;
        int bestSn =0;
        int snowballTime = 0;
        int bestTime =0;
        int snowballQuality = 0;
        int bestQ =0;
        int snowballValue = 0;
        int bestSnow = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++){
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = (int)Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > bestSnow){
                bestSnow = snowballValue;
                bestSn = snowballSnow;
                bestQ = snowballQuality;
                bestTime = snowballTime;
            }
        }
        System.out.printf(" %d : %d = %d (%d)", bestSn, bestTime, bestSnow, bestQ );
    }
}
