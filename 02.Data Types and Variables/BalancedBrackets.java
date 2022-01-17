import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = Integer.parseInt(scanner.nextLine());
        String input = "";
        int openBracket = 0;
        int closeBracket = 0;

        for (int i=0; i < count; i++){
            input = scanner.nextLine();

            if (input.equals("(")){
                openBracket +=1;
            }else if (input.equals(")")){
                closeBracket +=1;
                if (openBracket - closeBracket != 0)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

        }
        if (openBracket == closeBracket){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
