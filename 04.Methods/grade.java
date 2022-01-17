import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        String writtenGrade = gradeRes(grade);
        System.out.println(writtenGrade);

    }

    private static String gradeRes(double grade) {
        String gradeRes = "Poor";
        if (grade < 2.99){
            gradeRes = "Fail";
        }else if (grade >= 3.00 && grade < 3.50){
            gradeRes = "Poor";
        }else if (grade >= 3.50 && grade < 4.50){
            gradeRes = "Good";
        }else if (grade >= 4.50 && grade < 5.50){
            gradeRes = "Very good";
        }else {
            gradeRes = "Excellent";
        }
        return gradeRes;
    }
}
