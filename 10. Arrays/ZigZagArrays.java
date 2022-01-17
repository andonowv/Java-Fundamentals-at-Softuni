import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int [] firstArr = new int[count];
        int [] secondArr = new int[count];


        for (int i = 0; i < count; i++){
            int [] testArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            if (i % 2 == 0 || i == 0){
                firstArr [i] = testArr[0];
                secondArr [i] = testArr [1];
            } else {
                firstArr [i] = testArr [1];
                secondArr [i] = testArr [0];
            }

        }

        for (int i = 0; i < count; i++){
            System.out.printf("%d ", firstArr[i]);
        }
        System.out.println();
        for (int j =0; j < count; j++){
            System.out.printf("%d ", secondArr[j]);
        }
    }
}
