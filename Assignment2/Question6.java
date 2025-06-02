import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : args) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Items repeated more than twice:");
        freqMap.entrySet().stream()
               .filter(e -> e.getValue() > 2)
               .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
