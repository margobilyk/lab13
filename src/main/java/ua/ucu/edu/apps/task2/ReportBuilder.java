package ua.ucu.edu.apps.task2;

public class ReportBuilder {
    private final Database database;

    public ReportBuilder(Database database) {
        this.database = database;
        System.out.println("User Data: " + database.getUserData());
        System.out.println("Statistics Data: " + database.getStatisticsData());
    }
}
