import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        // Checking for abc
        String email = "abc.xyz";

        // Email regex
        String regex = "^abc(\\.[a-zA-Z0-9]+)?$";


        boolean isValid = Pattern.matches(regex, email);
        System.out.println("Email: " + email + " is " + (isValid ? "Valid" : "Invalid"));

    }
}
