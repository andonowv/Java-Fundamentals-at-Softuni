import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        upperTriangle(num);
        downTriangle(num);

    }
    public static void upperTriangle(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
    public static void downTriangle (int num){
        for (int i = num -1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}