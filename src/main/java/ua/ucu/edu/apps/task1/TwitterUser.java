package ua.ucu.edu.apps.task1;

public class TwitterUser {
    private String userMail;
    private String userCountry;
    private String userActiveTime;

    public TwitterUser(String userMail, String userCountry, String userActiveTime) {
        this.userMail = userMail;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return userMail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserActiveTime() {
        return userActiveTime;
    }
}
