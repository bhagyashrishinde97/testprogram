package Testassessment;

public class Percentageforloop {
    public static void calculateCharacterPercentages(String input) {
        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, otherCount = 0;

        // Traverse the input string character by character
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) uppercaseCount++;
            else if (Character.isLowerCase(ch)) lowercaseCount++;
            else if (Character.isDigit(ch)) digitCount++;
            else otherCount++;
        }

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
