package Problems.Arrays_and_Strings.C1P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        System.out.println(allCharsAreUnique(word));
    }

    private static boolean allCharsAreUnique(String string) {
        Set<Character> charsSet = new HashSet<>();

        for (Character character: string.toCharArray()) {
            if (charsSet.contains(character)) {
                return false;
            }
            charsSet.add(character);
        }

        return true;
    }
}
