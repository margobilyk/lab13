package ua.ucu.edu.apps.task2;

public class DatabaseAdapter implements Database {
    private final БазаДаних database;

    public DatabaseAdapter(БазаДаних database) {
        this.database = database;
    }

    @Override
    public String getUserData() {
        return database.отриматиДаніКористувача();
    }

    @Override
    public String getStatisticsData() {
        return database.отриматиСтатистичніДані();
    }

    public БазаДаних getLegacyDatabase() {
        return database;
    }
}
