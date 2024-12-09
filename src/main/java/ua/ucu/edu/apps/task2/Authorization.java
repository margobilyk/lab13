package ua.ucu.edu.apps.task2;

public class Authorization {

    private final Авторизація auth;

    public Authorization() {
        this.auth = new Авторизація();
    }

    public boolean authorise(Database database) {
        return auth.авторизуватися(database.getDb());
    }
}
