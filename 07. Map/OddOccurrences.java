import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().toLowerCase(Locale.ROOT).split(" ");
        Map <String, Integer> countWords = new LinkedHashMap<>();
        List <String> finalArray = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (!countWords.containsKey(input[i])){
                countWords.put(input[i], 0);
            } countWords.put(input[i], countWords.get(input[i]) +1);
        }
        for (Map.Entry <String, Integer> entry : countWords.entrySet()){
            if (entry.getValue() % 2 == 1){
                finalArray.add(entry.getKey());
            }
        }
        System.out.printf(String.join(", ", finalArray));
    }
}
