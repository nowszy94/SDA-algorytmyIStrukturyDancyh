package algorytmy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Szymon", "Anna", "Bartosz", "Sebastian", "Sylwia");
        List<String> collect1 = list.stream()
                .filter(e -> e.startsWith("S"))
                .filter(e -> !e.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(collect1);

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("abc", "Szymon");
        stringStringHashMap.put("cba", "Anna");
        stringStringHashMap.entrySet().stream()
                .filter(e -> e.getKey().equals("abc"))
                .forEach(e -> System.out.println(e.getValue()));
    }

}
