package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Authorization authorization = new Authorization();

        if (authorization.authorise(database)) {
            new ReportBuilder(database);
        }
    }
}
