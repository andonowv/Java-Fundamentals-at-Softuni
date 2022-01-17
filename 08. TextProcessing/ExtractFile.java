import java.util.Scanner;
import java.util.SortedMap;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int fileNameIndex = input.lastIndexOf('\\');
        int extsIndex = input.lastIndexOf('.');

        String fileName = input.substring(fileNameIndex +1, extsIndex);
        String exts = input.substring(extsIndex +1, input.length());

        System.out.printf("File name: %s", fileName);
        System.out.println();
        System.out.printf("File extension: %s", exts);
    }
}
