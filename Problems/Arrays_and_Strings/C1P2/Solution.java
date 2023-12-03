package Problems.Arrays_and_Strings.C1P2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The first string:");
        String firstString = reader.readLine();

        System.out.println("The second string:");
        String secondString = reader.readLine();

        System.out.println(areTwoStringsPermutations(firstString, secondString));
    }

    public static boolean areTwoStringsPermutations(String firstString, String secondString) {
        Map<Character, Integer> charactersCount = new HashMap<>();
        for (char character: firstString.toCharArray()) {
            charactersCount.put(character, charactersCount.getOrDefault(character, 0) + 1);
        }

        for (char character: secondString.toCharArray()) {
            Integer currentCount = charactersCount.get(character);
            if (currentCount != null && currentCount > 0) {
                charactersCount.put(character, currentCount - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry: charactersCount.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
