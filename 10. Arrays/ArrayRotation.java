import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int rotation = Integer.parseInt(scanner.nextLine());
        int firstEl = 0;

        for (int i=0; i < rotation; i++){
            firstEl = array[0];
            for (int j =0; j < array.length -1; j++){
                array[j]= array [j+1];
            }
            array[array.length -1] = firstEl;
        }

        for (int j = 0; j < array.length; j++){
            System.out.printf("%d ", array[j]);
        }
    }
}
