import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int remain = capacity % people;
        int trips = 0;

        trips = people / capacity;

        if ( people % capacity != 0){
            trips +=1;
        }

        System.out.println(trips);
    }
}
