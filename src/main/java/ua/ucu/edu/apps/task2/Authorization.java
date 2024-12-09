package ua.ucu.edu.apps.task2;

public class Authorization {
    public boolean logIn(DataBase db) {
        db.getUserData();
        return true;
    }
}
