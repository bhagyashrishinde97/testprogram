package Testassessment;

import java.util.function.Predicate;

public class Percentagestream {


        public static void calculateCharacterPercentages(String input) {
            // Define predicates for uppercase, lowercase, and digit
            Predicate<Character> isUpperCase = Character::isUpperCase;
            Predicate<Character> isLowerCase = Character::isLowerCase;
            Predicate<Character> isDigit = Character::isDigit;

            // Count uppercase, lowercase, digits, and others using streams
            long uppercaseCount = input.chars().mapToObj(c -> (char) c).filter(isUpperCase).count();
            long lowercaseCount = input.chars().mapToObj(c -> (char) c).filter(isLowerCase).count();
            long digitCount = input.chars().mapToObj(c -> (char) c).filter(isDigit).count();
            long otherCount = input.length() - (uppercaseCount + lowercaseCount + digitCount);

            // Calculate and print the percentages
            int totalCharacters = input.length();
            System.out.printf("Uppercase letters: %d (%.2f%%)\n", uppercaseCount, (uppercaseCount * 100.0) / totalCharacters);
            System.out.printf("Lowercase letters: %d (%.2f%%)\n", lowercaseCount, (lowercaseCount * 100.0) / totalCharacters);
            System.out.printf("Digits: %d (%.2f%%)\n", digitCount, (digitCount * 100.0) / totalCharacters);
            System.out.printf("Other characters: %d (%.2f%%)\n", otherCount, (otherCount * 100.0) / totalCharacters);
        }

        public static void main(String[] args) {
            String input = "Tiger Runs @ The Speed Of 100 km/hour.";
            calculateCharacterPercentages(input);
        }
    }


