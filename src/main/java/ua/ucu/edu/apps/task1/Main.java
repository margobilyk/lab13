package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;
        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser =
                    new FacebookUser("test@email", "Ukraine", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;

            case TWITTER:
                TwitterUser twitterUser =
                    new TwitterUser("test@email", "USA", LocalDateTime.now().minusDays(0).toString());
                user = new TwitterUserAdapter(twitterUser);
                break;

            default:
                break;
        }

        if (user != null) {
            MessageSender sender = new MessageSender();
            sender.send(user, "Hello, please give me a good grade!!");
        }
    }
}
