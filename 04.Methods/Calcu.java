import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operator = scanner.nextLine();
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double output = calculator (operator, firstNum, secondNum);
        System.out.printf("%.0f", output);
    }

    private static double calculator(String operator, double firstNum, double secondNum) {
        double result =0;
        switch (operator){
            case "add":
                result = firstNum+secondNum;
                break;
            case "multiply":
                result = firstNum * secondNum;
                break;
            case "subtract":
                result = firstNum - secondNum;;
                break;
            case  "divide":
                result = firstNum / secondNum;
                break;

        }
        return result;
    }
}
