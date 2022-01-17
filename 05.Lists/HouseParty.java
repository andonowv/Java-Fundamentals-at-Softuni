import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <String> names = new ArrayList<>();
        for (int i= 0; i < count; i++){
            String whosGoing = scanner.nextLine();
            String [] input = whosGoing.split(" ");

            if (names.contains(input[0]) && !input[2].equals("not")){
                System.out.printf("%s is already in the list!", input[0]);
                System.out.println();
            }
            else if (input[2].equals("going!")){
                names.add(input[0]);
            } else if (input[2].equals("not")){
                if (names.contains(input[0])){
                    names.remove(input[0]);
                } else {
                    System.out.printf("%s is not in the list!", input[0]);
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < names.size(); i++){
            System.out.printf("%s ", names.get(i));
            System.out.println();
        }
    }
}
