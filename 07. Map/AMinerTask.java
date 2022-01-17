import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, Integer> countMine= new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){
            String metal = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!countMine.containsKey(metal)){
                countMine.put(metal, quantity);
            }else {
                countMine.put(metal, countMine.get(metal) + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : countMine.entrySet()){
            System.out.printf("%s -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}
