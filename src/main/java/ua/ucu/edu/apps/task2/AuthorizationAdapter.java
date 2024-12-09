package ua.ucu.edu.apps.task2;

public class AuthorizationAdapter {
    private final Авторизація authorization;

    public AuthorizationAdapter() {
        this.authorization = new Авторизація();
    }

    public boolean authorize(DatabaseAdapter database) {
        return authorization.авторизуватися(new БазаДаних());
    }
}
