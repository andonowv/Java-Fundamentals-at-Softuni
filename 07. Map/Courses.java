import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map <String, List<String>> registered = new LinkedHashMap<>();

        while (!command.equals("end")){
            String [] input = command.split(" : ");
            String course = input [0];
            String name = input [1];

            registered.putIfAbsent(course, new ArrayList<>());
            registered.get(course).add(name);

            command = scanner.nextLine();
        }

        registered
                .entrySet()
                .stream()
                .sorted((c1, c2) -> {
                    int first = c1.getValue().size();
                    int second = c2.getValue().size();
                    return Integer.compare(second, first);
                })
                .forEach( c -> {
                    System.out.println(String.format("%s: %d",
                            c.getKey(),
                            c.getValue().size()));
                    c.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println(String.format("-- %s", s)));
                });
    }
}
