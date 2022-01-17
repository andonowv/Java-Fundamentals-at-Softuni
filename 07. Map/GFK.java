import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GFK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = {
                {5, 6, 10, 20, 30},
                {56, 6, 10, 20, 30},
                {5, 6, 10, 46, 30},
                {96, 6, 70, 20, 30},
                {5, 6, 10, 20, 15},
        };

        List <Integer> numbers = new ArrayList<>();

        for (int row = 0; row < 5; row++){
            for (int columns = 0; columns < 5; columns++){
                if (matrix[row][columns] >= 30 && matrix[row][columns] <= 70){
                    numbers. add(matrix[row][columns]);
                }
            }
        }
        int sum = 0;
        // sortirane na lista vyv vyzhodyasth red

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));
            sum+=numbers.get(i);
        }
        System.out.println();
        System.out.printf("%d ", sum);
    }
}
