package ua.ucu.edu.apps.task2;

public class AuthorizationAdapter implements Authorization {
    private final Авторизація authorization;

    public AuthorizationAdapter(Авторизація authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean authorize(Database database) {
        if (database instanceof DatabaseAdapter) {
            БазаДаних legacyDb = ((DatabaseAdapter) database).getLegacyDatabase();
            return authorization.авторизуватися(legacyDb);
        }
        return false;
    }
}
