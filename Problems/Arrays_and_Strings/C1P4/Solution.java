package Problems.Arrays_and_Strings.C1P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The string:");
        String input = reader.readLine();

        System.out.println(isPalindromePermutation(input));
    }

    public static boolean isPalindromePermutation(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (char character: string.toCharArray()) {
            character = Character.toLowerCase(character);
            if (character != ' ') {
                map.put(character, map.getOrDefault(character, 0) + 1);
            }
        }

        // In case we have only one character we cannot create permutation
        if (map.entrySet().size() < 2) {
            return false;
        }

        int oddCharsCount = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddCharsCount++;
            }
            if (oddCharsCount > 1) {
                return false;
            }
        }

        return true;
    }
}
