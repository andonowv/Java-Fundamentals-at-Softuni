import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = Double.parseDouble(scanner.nextLine());
        score (score);
    }
    public static void score (double score){
        if (score >= 2 && score < 3){
            System.out.println("Fail");
        } else if (score >=3 && score < 3.50){
            System.out.println("Poor");
        } else if (score >= 3.50 && score < 4.50){
            System.out.println("Good");
        } else if (score >= 4.50 && score < 5.50){
            System.out.println("Very good");
        } else if (score >= 5.50 && score <= 6){
            System.out.println("Excellent");
        }
    }

}
