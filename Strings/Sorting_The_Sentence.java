package Strings;

import java.util.HashMap;
import java.util.Map;

public class Sorting_The_Sentence {

    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();

        // Split each word based on space
        for (String word : s.split(" ")) {
            int lastIndex = word.length() - 1;

            // Get the word and index separately
            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);

            map.put(index, actualWord);
        }

        // Build the new correct orderd string
        StringBuilder actualString = new StringBuilder();
        for (Map.Entry<Integer, String> indexWord : map.entrySet()) {
            actualString.append(indexWord.getValue());
            actualString.append(" ");
        }

        return actualString.toString().trim();
    }
}
