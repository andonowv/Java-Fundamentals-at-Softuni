import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = Integer.parseInt(scanner.nextLine());
        int [] wagons = new int[count];

        for (int i = 0; i < count; i++){
            wagons [i] = Integer.parseInt(scanner.nextLine());
            sum+=wagons[i];
        }
        for (int j=0; j < count; j++){
            System.out.printf("%d ", wagons[j]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
