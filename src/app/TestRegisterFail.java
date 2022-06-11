package app;

import app.classes.User;
import app.classes.Registra;

public class TestRegisterFail {
    public static void main(String[] args) {
        User user = new User("Bao Xian", "abcde@gmail.com", "cdE12345");
        System.out.println(user.toString());
        
        Registra registra = new Registra();
        registra.registerUser(user);
    }
}
