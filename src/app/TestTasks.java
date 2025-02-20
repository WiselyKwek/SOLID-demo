package app;

import app.classes.TaskType;
import app.classes.User;
import app.classes.SuperUser;

public class TestTasks {
    public static void main(String[] args) {
        User normalUser = new User("Bao Xian", "abcde@gmail.com", "@bcdE12345");

        System.out.println("Trying tasks for normal user...");

        System.out.println("performing normal task...");
        normalUser.performTask(TaskType.Simple);

        System.out.println("performing difficult task...");

        normalUser.performTask(TaskType.Difficult);

        // add your code here to test for super users

        User superUser = new SuperUser("Bao Xian", "abcde@gmail.com", "@bcdE12345");

        superUser.performTask(TaskType.Difficult);





        // add your code here to test for the last kind of users


    }
}
