import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        
        printTriangle(size);
    }

    private static void printTriangle(int size) {
        printUpper (size);
        printDown(size);
    }

    private static void printUpper(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
    
    private static void printDown(int size) {
        for (int i = size -1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
    }
    
}}
