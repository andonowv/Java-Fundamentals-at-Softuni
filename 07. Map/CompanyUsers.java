import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map <String, List <String>> companyUsers = new LinkedHashMap<>();

        while (!input.equals("End")){

            String [] tokens = input.split(" -> ");
            String company = tokens [0];
            String id = tokens [1];

            companyUsers.putIfAbsent(company, new ArrayList<>());
            if (!companyUsers.get(company).contains(id)){
                companyUsers.get(company). add(id);
            }

            input = scanner.nextLine();
        }
        companyUsers
                .forEach((key, value) -> {
                    System.out.println(key);
                    value.forEach(a -> System.out.println("-- " + a));
                });
    }
}
