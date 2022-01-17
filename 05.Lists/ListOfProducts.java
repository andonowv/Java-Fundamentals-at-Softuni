import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <String> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            String input = scanner.nextLine();
            list.add(input);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++){
            System.out.printf("%d.%s", i+1, list.get(i));
            System.out.println();
        }
    }
}
