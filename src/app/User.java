package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final String name;
    private final String email;
    private final String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void registerUser() {
        if (!this.isValid()) {
            return;
        }

        // some code to add to database
        // send an email to welcome user
        this.sendEmail();
    }

    public void sendEmail() {
        String message = "Hello " + name + ", welcome to this app!";
        //some code to send the email
    }

    public boolean isValid() {
        // check if email is valid
        // valid email should have "@"
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(email);

        if (!emailMatcher.matches()) {
            return false;
        }

        // check if password is valid
        // password should have a digit (?=.*[0-9])
        // password should have a lowercase character (?=.*[a-z])
        // password should have a uppercase character (?=.*[A-Z])
        // password should have a special character (?=.*[!@#&()–[{}]:;',?/*~$^+=<>])
        // password should be between 8 and 20 characters .{8,20}
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);

        if (!passwordMatcher.matches()) {
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
