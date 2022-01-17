import java.util.Scanner;

public class RepeatStringVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String output = repeatText (text, count);
        System.out.println(output);
    }

    private static String repeatText(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output+=text;
        }
        return output;
    }
}
