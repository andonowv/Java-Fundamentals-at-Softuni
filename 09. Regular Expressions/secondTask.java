import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List <Integer> nums = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split(" ");
            int firstNum = Integer.parseInt(tokens[0]);
            String command = tokens [1];
            int secondNum = Integer.parseInt(tokens[2]);

            if (command.equals("after")){

            }

        }
    }
}
