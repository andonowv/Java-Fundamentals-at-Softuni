import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine();
        int num = Integer.parseInt(inputNum);
        int first = num;
        int sum = 0;
        int res = 1;
        int multi = 1;

        for (int i = 0; i < inputNum.length(); i++){
            int currentNum = num % 10;
            num /= 10;
            for (int j = currentNum - 1; j > 0; j--){
                currentNum *= j;
            }
            sum += currentNum;
        }
        if (sum == first){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
