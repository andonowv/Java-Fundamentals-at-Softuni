import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countKeyboard = 0;

        double money = 0;

        for (int i = 1; i <=lostGameCount; i++){
            if (i % 2 == 0 && i % 3 ==0 ){
                money += headsetPrice + mousePrice + keyboardPrice;
                countKeyboard++;
                if (countKeyboard == 2){
                    money+=displayPrice;
                    countKeyboard =0;
                }
            }else if (i % 3 == 0){
                money += mousePrice;
            }
            else if (i % 2 == 0){
                money +=headsetPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", money);
    }
}
