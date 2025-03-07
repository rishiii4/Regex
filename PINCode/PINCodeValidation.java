import java.util.regex.Pattern;

public class PINCodeValidation {
    public static void main(String[] args) {
        // Test PIN code
        String pinCode = "400088";
        
        String pinCode2 = "A400088";

        // PIN code validation pattern
        String regex = "^[1-9][0-9]{2}\\s?[0-9]{3}$";

        boolean isValid = Pattern.matches(regex, pinCode);
        System.out.println("Is valid PIN Code? " + isValid);

        // It should fail
        boolean isValid2 = Pattern.matches(regex, pinCode2);
        System.out.println("Is valid PIN Code? " + isValid2);
    }
}
