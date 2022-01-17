import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List <Double> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List <Double> finalList = new ArrayList<>();

        if (firstList.size() > secondList.size()){

            for (int i = 0; i < secondList.size(); i++){
                System.out.printf("%.0f ", firstList.get(i));
                System.out.printf("%.0f " , secondList.get(i));
            }
            int diff = firstList.size() - secondList.size();
            for (int j = firstList.size() - diff; j < firstList.size(); j++){
                System.out.printf("%.0f ", firstList.get(j));
            }
        } else {
            for (int i = 0; i < firstList.size(); i++){
                System.out.printf("%.0f ", firstList.get(i));
                System.out.printf("%.0f " , secondList.get(i));
            }
            int diff = secondList.size() - firstList.size();
            for (int j = secondList.size() - diff; j < secondList.size(); j++){
                System.out.printf("%.0f ", secondList.get(j));
            }
        }
    }
}
