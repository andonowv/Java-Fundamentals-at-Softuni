import java.util.Scanner;

public class ribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.next());



        if (num == 1){
            System.out.println("1");
            return;
        } else if (num == 2){
            System.out.println("1 1");
            return;
        }
        int [] tribonacci = new int[num];

        tribonacci [0] = 1;
        tribonacci [1] = 1;
        tribonacci [2] = 2;

        for (int i = 3; i < num; i++){
            tribonacci [i] = tribonacci [i - 3] + tribonacci [i-2] + tribonacci [i-1];
        }
        for (int i = 0; i < num; i++){
            System.out.printf("%d ", tribonacci [i]);
        }
    }
}
