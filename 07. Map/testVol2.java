import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class testVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = {
                {10, 20, 30, 40, 50},
                {11, 12, 13, 14, 15},
                {12, 22, 32, 42, 53},
                {11, 12, 13, 14, 15},
                {10, 20, 30, 40, 50},
        };
        List <Integer> numbers = new ArrayList<>();
        for ( int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                if (matrix[row][column] >= 30 && matrix[row][column] <=70){
                    numbers.add(matrix[row][column]);
                }
            }
        }
        int sum = 0;
        numbers.sort(Comparator.reverseOrder());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%d ", numbers.get(i));
            sum+=numbers.get(i);
        }
        System.out.println();
        System.out.printf("%d ", sum);
    }
}
