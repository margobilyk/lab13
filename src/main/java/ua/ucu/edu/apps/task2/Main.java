package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization auth = new Authorization();
        if (auth.logIn(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }

        System.out.println(db.getUserData());
        System.out.println(db.getStaticData());
    }
}
