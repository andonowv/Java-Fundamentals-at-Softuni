import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] + array[j] == magicNum){
                    System.out.printf("%d %d", array[i], array[j]);
                    System.out.println();
                }
            }
        }
    }
}
