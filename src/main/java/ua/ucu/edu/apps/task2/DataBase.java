package ua.ucu.edu.apps.task2;

import lombok.Getter;

public class Database {

    @Getter
    private final БазаДаних db;

    public Database() {
        this.db = new БазаДаних();
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return db.отриматиСтатистичніДані();
    }
}
