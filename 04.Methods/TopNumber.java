import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 16; i <= num; i++){
            boolean isValid = false;
            int sumInt = 0;
            int currentNum = i;
            while (currentNum != 0){
                int lastDigit = currentNum%10;
                if (lastDigit % 2 == 1){
                    isValid = true;
                }
                sumInt += lastDigit;
                currentNum/=10;
            }
            if (sumInt % 8 == 0 && isValid == true){
                isValid = true;
            } else {
                isValid = false;
            }
            if (isValid == true){
                System.out.println(i);
            }
        }
    }
}
