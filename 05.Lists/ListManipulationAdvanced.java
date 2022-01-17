import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String firstIndex = command[0];

            if (firstIndex.equals("Contains")) {
                int secondIndex = Integer.parseInt(command[1]);
                if (list.contains(secondIndex)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (firstIndex.equals("Print")) {
                String secondIndex = command[1];
                if (secondIndex.equals("even")) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) % 2 == 0) {
                            System.out.printf("%d ", list.get(i));
                        }
                    }
                    System.out.println();
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) % 2 == 1) {
                            System.out.printf("%d ", list.get(i));
                        }
                    }
                    System.out.println();

                }
            } else if (firstIndex.equals("Get")){
                int sum = 0;
                for (int i = 0; i < list.size(); i++){
                    sum += list.get(i);
                }
                System.out.println(sum);
            } else if (firstIndex.equals("Filter")){
                String secondIndex = command [1];
                int thirdIndex = Integer.parseInt(command[2]);
                if (secondIndex.equals(">=")){
                    for (int i = 0; i < list.size(); i++){
                        if (list.get(i) >= thirdIndex){
                            System.out.printf("%d ", list.get(i));
                        }
                    }

                    System.out.println();
                } else if (secondIndex.equals("<")){
                    for (int i = 0; i < list.size(); i++){
                        if (list.get(i) < thirdIndex){
                            System.out.printf("%d ", list.get(i));
                        }
                    }

                    System.out.println();
                } else if (secondIndex.equals("<=")){
                    for (int i = 0; i < list.size(); i++){
                        if (list.get(i) <= thirdIndex){
                            System.out.printf("%d ", list.get(i));
                        }
                    }
                    System.out.println();
                } else if (secondIndex.equals(">")){
                    for (int i = 0; i < list.size(); i++){
                        if (list.get(i) > thirdIndex){
                            System.out.printf("%d ", list.get(i));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
    }}