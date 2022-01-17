import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class testTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, String> firstMap = new LinkedHashMap<>();
        Map <String, String> secondMap = new LinkedHashMap<>();

        firstMap.put("pyrvi", "gosho");
        firstMap.put("vtori", "Ivan");
        firstMap.put("treti", "Georgi");

        secondMap.put("pedal", "pedalov");
        secondMap.put("lesbiika", "lesbiikova");

        for (Map.Entry <String, String> entry : secondMap.entrySet()) {
            System.out.printf("%s %s \n", entry.getKey(), entry.getValue());

        }
    }
}
