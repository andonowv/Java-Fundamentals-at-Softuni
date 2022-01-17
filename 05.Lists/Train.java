import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int maxPassenger = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] array = input.split(" ");
            String command = array[0];


            if (command.equals("Add")){
                int num = Integer.parseInt(array[1]);
                wagons.add(num);
            } else {
                int secNum = Integer.parseInt(array[0]);{
                    for (int i =0; i < wagons.size(); i++){
                        if (wagons.get(i)+secNum <= maxPassenger){
                            int wagon = wagons.get(i) + secNum;
                            wagons.set(i, wagon);
                            break;
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < wagons.size(); i++){
            System.out.printf("%d ", wagons.get(i));
        }
    }
}
