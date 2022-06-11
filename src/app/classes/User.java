package app.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean isSuper;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /*
     * There are 4 actions (excl. getters) in this class
     * this violates the SINGLE RESPONSIBILITY PRINCIPLE (S) of SOLID design
     * 
     * Create a new class to register Users
     */
    // public void registerUser() {
    //     if (!this.isValid()) {
    //         System.out.println("User is not valid");
    //         return;
    //     }
        
    //     // some code to add to database
    //     System.out.println("Registered user with name: " + this.name);

    //     // send an email to welcome user
    //     this.sendEmail();
    // }

    // public void sendEmail() {
    //     String message = "Hello " + name + ", welcome to this app!";
    //     //some code to send the email
    //     System.out.println("Sent email with message: " + message);
    // }

    public boolean isValid() {
        // check if email is valid
        // valid email should have "@"
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(email);

        if (!emailMatcher.matches()) {
            System.out.println("Email is not valid!");
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
            System.out.println("Password is not valid!");
            return false;
        }

        return true;
    }

    // open closed principle - user class should not be modified as much as possible.
    public void performTask(TaskType taskType) {
        if (!this.isSuper) {
            if (taskType == TaskType.Difficult) {
                System.out.println("I am struggling... \uD83D\uDE2D");
                return;
            }
        }
        System.out.println("This is ok!");
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
