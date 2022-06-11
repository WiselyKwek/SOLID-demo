package app.classes;

public class SuperUser extends User{
    public SuperUser(String name, String email, String password){
        super(name, email, password);
    }

    public void performTask(TaskType taskType) {
        System.out.println("This is ok!");
    }

}
