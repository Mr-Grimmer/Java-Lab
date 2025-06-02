import java.io.*;
import java.util.*;

public class Question8 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> wordFreq = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\W+")) {
                if (!word.isEmpty()) {
                    word = word.toLowerCase();
                    wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordFreq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Descending

        System.out.println("Greatest: " + list.get(0));
        System.out.println("Least: " + list.get(list.size() - 1));
    }
}
