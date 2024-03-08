import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Untitled document.txt");
        Scanner txtFile = new Scanner(file);
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();
        while (txtFile.hasNext()) {
            String word = txtFile.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        txtFile.close();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

