import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int day = 0;
        int totalYield = 0;

        while (yield >= 100){
            day +=1;
            totalYield += yield;
            if (totalYield <= 26){
                totalYield = 0;
            }else {
                totalYield -=  26;
            }

            yield = yield - 10;

        }

        if (totalYield <= 26){
            totalYield = 0;
        }else {
            totalYield -=  26;
        }
        System.out.println(day);
        System.out.println(totalYield);
    }
}
