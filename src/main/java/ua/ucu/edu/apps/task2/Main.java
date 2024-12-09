package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        DatabaseAdapter db = new DatabaseAdapter();
        AuthorizationAdapter authorization = new AuthorizationAdapter();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
