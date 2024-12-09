import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.task1.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;

class TwitterUserTest {
    @Test
    void testGetters() {
        TwitterUser user = new TwitterUser("example@mail.com", "USA", "12:30 PM");

        assertEquals("example@mail.com", user.getEmail());
        assertEquals("USA", user.getUserCountry());
        assertEquals("12:30 PM", user.getUserActiveTime());
    }
}
