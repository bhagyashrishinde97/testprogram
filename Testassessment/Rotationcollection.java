package Testassessment;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rotationcollection {
    public static boolean rotetionalstring(String original, String rotated) {
        if (original.length() != rotated.length()) {
            return false;
        }
        List<Character> originalList = original.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> rotatedList = rotated.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        // Rotate the original list by half its length
        Collections.rotate(originalList, original.length() / 2);
        return originalList.equals(rotatedList);
    }

    public static void main(String[] args) {
        String original = "JavaJ2eeStrutsHibernate";
        String rotation = "StrutsHibernateJavaJ2ee";

        if (rotetionalstring(original, rotation)) {
            System.out.println(rotation + " is a rotation of " + original);
        } else {
            System.out.println(rotation + " is not a rotation of " + original);
        }
    }
}
