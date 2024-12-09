package ua.ucu.edu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public class TwitterUser {
    private String userMail;
    private String userCountry;
    private String userActiveTime;

    public String getEmail(){
        return userMail;
    }

    public String getUserCountry(){
        return userCountry;
    }

    public String getUserActiveTime(){
        return userActiveTime;
    }
}
