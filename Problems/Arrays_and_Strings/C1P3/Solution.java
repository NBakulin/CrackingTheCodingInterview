package Problems.Arrays_and_Strings.C1P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The string:");
        String firstString = reader.readLine();

        System.out.println(replaceSpaces(firstString));
    }

    public static String replaceSpaces(String firstString) {
        StringBuilder result = new StringBuilder();
        for (char character: firstString.toCharArray()) {
            if (character == ' ') {
                result.append("%20");
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
