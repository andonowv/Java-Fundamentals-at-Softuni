import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] array = input.split(" ");
            String command = array [0];
            int value = Integer.parseInt(array[1]);

            if (command.equals("Delete")){
                for (int i =0; i<list.size(); i++){
                    if (list.get(i) == value){
                        list.remove(Integer.valueOf(value));
                        i = -1;
                    }
                }
            } else if (command.equals("Insert")){
                list.add(Integer.parseInt(array[2]), value);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%d ", list.get(i));
        }
    }
}
