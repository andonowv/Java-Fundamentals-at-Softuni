import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String info = scanner.nextLine();
        String [] input = info.split(" ");
        int specialNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        for (int i = 0; i < list.size(); i++){
            int currentNum = i;
            if (specialNumber == list.get(i)){
                for (int j = 1; j <= power * 2 + 1; j++){
                    if (currentNum - power >= list.size()){
                        break;
                    } else if (currentNum - power < 0){
                        currentNum +=1;
                    }
                    else if (currentNum - power >= 0 && currentNum - power < list.size()){
                        list.remove(list.get(currentNum - power));
                    }
                }

            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++){

            sum += list.get(i);
        }
        System.out.printf("%d", sum);

    }
}
