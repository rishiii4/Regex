import java.util.regex.Pattern;

public class PINCodeValidation {
    public static void main(String[] args) {
        // Test PIN code
        String pinCode = "400088";

        // Testing with Alphabet
        String pinCode2 = "A400088";

        // Testing with Special Character
        String pinCode3 = "40008@";

        // PIN code validation pattern
        String regex = "^[1-9][0-9]{2}\\s?[0-9]{3}$";

        // It should not fail
        boolean isValid = Pattern.matches(regex, pinCode);
        System.out.println("Is valid PIN Code? " + isValid);

        // It should fail
        boolean isValid2 = Pattern.matches(regex, pinCode2);
        System.out.println("Is valid PIN Code? " + isValid2);

        // It should fail
        boolean isValid3 = Pattern.matches(regex, pinCode3);
        System.out.println("Is valid PIN Code? " + isValid3);
    }
}
