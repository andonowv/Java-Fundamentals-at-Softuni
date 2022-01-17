import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map <String, List <String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)){
                List <String> listOfSynonyms= new ArrayList<>();
                listOfSynonyms.add(synonym);
                synonyms.put(word, listOfSynonyms);
            } else {
                List <String> listOfSynonyms = synonyms.get(word);
                listOfSynonyms.add(synonym);
                synonyms.put(word, listOfSynonyms);
            }
        }
        for (Map.Entry <String, List <String>> wordEntry : synonyms.entrySet()){
            String currentWord = wordEntry.getKey();
            List <String> synonymsForCurrentWord = wordEntry.getValue();

            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }

    }
}
