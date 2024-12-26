package Testassessment;

    import java.util.Arrays;
    import java.util.stream.IntStream;

    import static Array.Anagramprogram.Areanagram;

public class RotationCheck {

    public static boolean rotationalstring(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }


    public static void main(String[] args) {
        String original = "JavaJ2eeStrutsHibernate";
        String rotation = "StrutsHibernateJavaJ2ee";

        if (rotationalstring(original, rotation)) {
            System.out.println(rotation + " is a rotation of " + original);
        }
        else
        {
            System.out.println(rotation + " is not a rotation of " + original);
        }
    }

}
