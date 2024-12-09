package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        БазаДаних legacyDatabase = new БазаДаних();
        Авторизація legacyAuthorization = new Авторизація();

        Database database = new DatabaseAdapter(legacyDatabase);
        Authorization authorization = new AuthorizationAdapter(legacyAuthorization);

        if (authorization.authorize(database)) {
            new ReportBuilder(database);
        }
    }
}
