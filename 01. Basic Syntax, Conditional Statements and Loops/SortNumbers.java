import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        int biggest = 0;
        int lowest = 0;
        int medium = 0;

        if (one > two && one > three){
            biggest = one;
        }else if (two > one && two > three){
            biggest = two;
        }else if (three > one && three > two){
            biggest = three;
        }
        if (one < two && one < three){
            lowest = one;
        } else if (two < three && two < one){
            lowest = two;
        }else if (three < one && three < two){
            lowest = three;
        }

        if (one == lowest && two == biggest || one == biggest && two == lowest){
            medium = three;
        }else if (two == lowest && three == biggest || two == biggest && three == lowest){
            medium = one;
        }else if (one == lowest && three == biggest || one == biggest && three == lowest ){
            medium = two;
        }
        System.out.println(biggest);
        System.out.println(medium);
        System.out.println(lowest);

    }
}
