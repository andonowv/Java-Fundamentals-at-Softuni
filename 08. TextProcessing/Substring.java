import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String finalWord = word;

        while (finalWord.contains(word)){
            finalWord = secondWord.replace(word, "");
            secondWord = finalWord;
        }

        System.out.println(finalWord);

    }
}
