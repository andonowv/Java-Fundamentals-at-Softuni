import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        Map <String, Integer> countLetter = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            String finalLetter = String.valueOf(letter);

            if (!countLetter.containsKey(finalLetter)){
                if (finalLetter.equals(" ")){
                    continue;
                }
                countLetter.put(finalLetter, 0);
            } countLetter.put(finalLetter, countLetter.get(finalLetter) +1);
        }
        for (Map.Entry<String, Integer> entry : countLetter.entrySet()){
            System.out.printf("%s -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}
