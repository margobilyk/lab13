package ua.ucu.edu.apps.task2;

public class DatabaseAdapter {
    private final БазаДаних db;

    public DatabaseAdapter() {
        this.db = new БазаДаних();
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return db.отриматиСтатистичніДані();
    }
}
