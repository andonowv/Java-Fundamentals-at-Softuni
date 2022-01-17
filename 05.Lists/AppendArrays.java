import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = list.size() -1; i >=0; i--){
            List <String> trimmed = Arrays.stream(list.get(i).split(" ")).collect(Collectors.toList());

            for (int j = 0; j < trimmed.size(); j++){
                if (trimmed.get(j).equals("")){
                    continue;
                }
                System.out.printf("%s ", trimmed.get(j));
            }
        }
    }
}
