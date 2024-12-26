package Testassessment;

import java.util.HashMap;
import java.util.Map;

public class Percentagemap {

        public static void calculateCharacterPercentages(String input) {
            Map<String, Integer> countMap = new HashMap<>();
            countMap.put("uppercase", 0);
            countMap.put("lowercase", 0);
            countMap.put("digits", 0);
            countMap.put("others", 0);

            // Traverse the string and update the count map
            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) countMap.put("uppercase", countMap.get("uppercase") + 1);
                else if (Character.isLowerCase(ch)) countMap.put("lowercase", countMap.get("lowercase") + 1);
                else if (Character.isDigit(ch)) countMap.put("digits", countMap.get("digits") + 1);
                else countMap.put("others", countMap.get("others") + 1);
            }

            // Calculate and print the percentages
            int totalCharacters = input.length();
            countMap.forEach((key, count) -> {
                double percentage = (count * 100.0) / totalCharacters;
                System.out.printf("%s: %d (%.2f%%)\n", key, count, percentage);
            });
        }

        public static void main(String[] args) {
            String input = "Tiger Runs @ The Speed Of 100 km/hour.";
            calculateCharacterPercentages(input);
        }
    }


