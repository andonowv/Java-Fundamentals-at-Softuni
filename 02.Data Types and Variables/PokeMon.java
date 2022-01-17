import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int originalPokePow = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (pokePower >= distance){
            count++;
            pokePower -=distance;

            if (pokePower == originalPokePow / 2.0 && exhaustionFactor !=0 && pokePower !=0){
                pokePower = pokePower / exhaustionFactor;
            }

        }
        System.out.println(pokePower);
        System.out.println(count);

    }
}
