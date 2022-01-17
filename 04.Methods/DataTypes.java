import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String input = scanner.nextLine();

        String output = result (type,input);

    }

    private static String result(String type, String input) {
        String result = "";
        if (type.equals("int")){
            int num = Integer.parseInt(input);
            int res = num * 2;
            result = String.valueOf(res);
            System.out.println(result);
        } else if (type.equals("real")){
            double num = Double.parseDouble(input);
            double res = num * 1.5;
            System.out.printf("%.2f", res);
            result = String.valueOf(res);
        } else if (type.equals("string")){
            System.out.printf("$%s$", input);
        }
        return result;
    }
}
