import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        int size = numbers.size();
        for (int i = 0; i < size /2 ; i++){
            double num = numbers.get(i) + numbers.get(numbers.size()-1);
            numbers.set(i, num);
            numbers.remove(numbers.size() - 1);
        }
        for (int j = 0; j < numbers.size(); j++){
            System.out.printf("%.0f ", numbers.get(j));
        }
    }
}
