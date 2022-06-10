package app.classes;

public interface User {
    public String getName();
    public String getEmail();
    public String getPassword();

    public void performTask(TaskType taskType);
}
