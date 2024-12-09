package ua.ucu.edu.apps.task1;

public class FacebookUserAdapter implements User {
    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String toString() {
        return "Email" + getEmail() + ", "
        + "Country" + getUserCountry();
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getUserCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getUserActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
    

