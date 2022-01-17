import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] array = input.split(" ");
            String command = array [0];
            int num = Integer.parseInt(array[1]);

            if (command.equals("Add")){
                list.add(num);
            } else if (command.equals("Remove")){
                list.remove(Integer.valueOf(num));
            } else if (command.equals("RemoveAt")) {
                list.remove(num);
            } else if (command.equals("Insert")){
                int secondNum = Integer.parseInt(array[2]);
                list.add(secondNum, num);
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%d ", list.get(i));
        }

    }
}
