package app.classes;

import app.classes.User;

public class Registra {
    public void registerUser(User user) {
        if (!user.isValid()) {
            System.out.println("User is not valid");
            return;
        }

        // some code to add to database
        System.out.println("Registered user with name: " + user.getName());

        // send an email to welcome user
        this.sendEmail(user);
    }

    public void sendEmail(User user){
        String message = "Hello " + user.getName() + ", welcome to this app!";
        // some code to send the email
        System.out.println("Sent email with message: " + message);
    }
}