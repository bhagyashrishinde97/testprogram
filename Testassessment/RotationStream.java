package Testassessment;

public class RotationStream {


    public static boolean isRotationUsingStreams(String original, String rotated) {
        if (original.length() != rotated.length()) {
            return false;
        }


        return original.length() > 0 &&
                original.chars().allMatch(c -> rotated.indexOf((char) c) != -1) &&
                (original + original).contains(rotated);
    }

    public static void main(String[] args) {
        // Test strings
        String original = "JavaJ2eeStrutsHibernate";
        String rotation = "StrutsHibernateJavaJ2ee";

        // Check if the rotation is valid and print the result
        if (isRotationUsingStreams(original, rotation)) {
            System.out.println(rotation + " is a rotation of " + original);
        } else {
            System.out.println(rotation + " is not a rotation of " + original);
        }
    }
}
