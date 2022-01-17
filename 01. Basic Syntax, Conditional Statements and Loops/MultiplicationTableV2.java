import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int nTimes = Integer.parseInt(scanner.nextLine());
        int res = 0;

        for (int i=nTimes; i < 11; i++){
            res = firstNum * i;
            System.out.printf("%d X %d = %d", firstNum,i,res);
            System.out.println();
        }
        if (nTimes > 10){
            res = firstNum * nTimes;
            System.out.printf("%d X %d = %d", firstNum,nTimes,res);
            System.out.println();
        }
    }
}
