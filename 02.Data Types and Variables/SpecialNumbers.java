import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;
        int sumNum = 0;
        int currentNum = 0;
        for (int i = 1; i <=num; i++){
            currentNum = i;
            while (currentNum != 0) {
                int digit = currentNum % 10;
                sumNum += digit;
                currentNum /=10;
            }

            if (sumNum == 5 || sumNum == 7 || sumNum == 11){
                isSpecial = true;
            }
            if (isSpecial == true){
                System.out.printf("%d -> True", i);
            }else {
                System.out.printf("%d -> False", i);
            }

            System.out.println();
            isSpecial = false;
            sumNum = 0;
        }


    }
}
