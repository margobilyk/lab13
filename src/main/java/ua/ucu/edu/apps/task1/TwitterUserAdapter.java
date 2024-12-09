package ua.ucu.edu.apps.task1;

public class TwitterUserAdapter implements User {
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }
    
    @Override
    public String toString() {
        return twitterUser.toString();
    }


    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }


    @Override
    public String getUserCountry() {
        return twitterUser.getUserCountry();
    }


    @Override
    public String getUserActiveTime() {
        return twitterUser.getUserActiveTime();
    }
}
