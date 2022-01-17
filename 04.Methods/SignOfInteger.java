import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        signInteger(num);

    }
    public static void signInteger (int num) {
        if (num < 0){
            System.out.printf("The number %d is negative.", num );
        } else if (num ==0){
            System.out.println("The number 0 is zero.");
        }else {
            System.out.printf("The number %d is positive", num);
        }
    }
}
