import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        massage(num);

    }

    private static void massage(int num) {
        String output = " ";
        if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }
        else if (num == 0){
            System.out.println("The number 0 is zero.");
        }
        else {
            System.out.printf("The number %d is positive.", num);
        }
    }
}
