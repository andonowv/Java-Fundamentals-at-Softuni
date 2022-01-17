import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap <Double, Integer> count = new TreeMap<>();

        for (double num : numbers){
            if (!count.containsKey(num)){
                count.put(num, 0);
            } count.put(num, count.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry: count.entrySet()){
            System.out.printf("%.0f -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }

    }
}
