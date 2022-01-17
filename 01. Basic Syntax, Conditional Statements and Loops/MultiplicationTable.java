import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int res = 0;

        for (int i = 1; i < 11; i++){
            res = num * i;

            System.out.printf("%d X %d = %d", num,i,res);
            System.out.println();
        }
    }
}
