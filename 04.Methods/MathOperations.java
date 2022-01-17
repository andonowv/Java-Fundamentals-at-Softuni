import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        int result = 0;

        switch (operator){
            case "/":
                result = devideResult(firstNum, secondNum);
                System.out.println(result);
                break;
            case "*":
                result = multiplyRes(firstNum, secondNum);
                System.out.println(result);
                break;
            case "+":
                result = addRes(firstNum, secondNum);
                System.out.println(result);
                break;
            case "-":
                result = subtraction (firstNum, secondNum);
                System.out.println(result);
                break;
        }
    }

    private static int subtraction(int firstNum, int secondNum) {
        int res = firstNum - secondNum;
        return res;
    }

    private static int addRes(int firstNum, int secondNum) {
        int res = firstNum + secondNum;
        return res;
    }

    private static int multiplyRes(int firstNum, int secondNum) {
        int res = firstNum*secondNum;
        return res;
    }

    private static int devideResult(int firstNum, int secondNum) {
        int res = firstNum / secondNum;
        return res;
    }
}
