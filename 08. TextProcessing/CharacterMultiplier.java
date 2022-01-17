import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arguments = scanner.nextLine().split(" ");
        Character currentLetter = ' ';
        int sum = 0;
        int part = 0;
        List <Integer> first = new ArrayList<>();
        List <Integer> second = new ArrayList<>();

        for (int j = 0; j < arguments[0].length(); j++) {
            currentLetter = arguments[0].charAt(j);
            first.add((int)currentLetter);
        }
        for (int j = 0; j < arguments[1].length(); j++) {
            currentLetter = arguments[1].charAt(j);
            second.add((int)currentLetter);
        }
        if (arguments[0].length() == arguments[1].length()){
            for (int i = 0; i < arguments[0].length(); i++) {

                part = first.get(i)*second.get(i);
                sum +=part;
                part = 0;
            }
        } else {
            int smaller = Math.min(arguments[0].length() , arguments[1].length());
            int bigger = Math.max(arguments[0].length() , arguments[1].length());
            for (int i = 0; i < bigger; i++) {
                if (i < smaller){
                    part = first.get(i)*second.get(i);
                    sum +=part;
                    part = 0;
                }
                else if (i >= smaller){
                    if (arguments[0].length() > arguments[1].length()){
                        sum +=first.get(i);
                    }else {
                        sum +=second.get(i);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
