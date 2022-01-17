import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (calculation.equals("add")){
            addCalculatuin(a, b);
        } else if (calculation.equals("multiply")){
            multyplyCalcu(a,b);
        } else if (calculation.equals("subtract")){
            subtractCalcu(a,b);
        } else if (calculation.equals("divide")){
            divideCalcu(a,b);
        }
    }

    private static void divideCalcu(int a, int b) {
        int res = a /b;
        System.out.println(res);
    }

    private static void subtractCalcu(int a, int b) {
        int res = a - b;
        System.out.println(res);
    }

    private static void multyplyCalcu(int a, int b) {
        int res = a*b;
        System.out.println(res);
    }

    private static void addCalculatuin(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}
