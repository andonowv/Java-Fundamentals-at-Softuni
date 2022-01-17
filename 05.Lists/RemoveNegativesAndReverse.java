import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < 0){
                list.remove(list.get(i));
                i = -1;
            }
        }
        for (int i = list.size(); i > 0; i--){
            System.out.printf("%d ", list.get(i-1));
        }
        if (list.isEmpty()){
            System.out.println("empty");
        }
    }
}
