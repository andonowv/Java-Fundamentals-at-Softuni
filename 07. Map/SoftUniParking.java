import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map <String, String> registered = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String [] input = scanner.nextLine().split(" ");

            String command = input [0];
            String name = input [1];


            if (command.equals("register")){
                String plateNumber = input[2];
                if (!registered.containsKey(name)){
                    System.out.printf("%s registered %s successfully", name, plateNumber);
                    System.out.println();
                    registered.put(name, plateNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s", plateNumber);
                    System.out.println();
                }
            }else if (command.equals("unregister")){
                if (!registered.containsKey(name)){
                    System.out.printf("ERROR: user %s not found", name);
                    System.out.println();
                }else {
                    System.out.printf("%s unregistered successfully", name);
                    System.out.println();
                    registered.remove(name);
                }
            }

        }
        for (Map.Entry<String, String> entry : registered.entrySet()) {
            System.out.printf("%s => %s", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}
