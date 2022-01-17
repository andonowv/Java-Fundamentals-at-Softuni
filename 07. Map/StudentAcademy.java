import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map <String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students
                .entrySet()
                .stream()
                .filter(s -> s
                        .getValue()
                        .stream()
                        .mapToDouble(e -> Double.valueOf(e))
                        .average()
                        .getAsDouble() >= 4.50)
                .sorted((s1, s2) -> {
                    double second = s2.getValue().stream().mapToDouble(e -> Double.valueOf(e)).average().getAsDouble();
                    double first = s1.getValue().stream().mapToDouble(e -> Double.valueOf(e)).average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue().stream().mapToDouble(e -> Double.valueOf(e)).average().getAsDouble())));
    }
}
