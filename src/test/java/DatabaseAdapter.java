import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.task2.Database;
import ua.ucu.edu.apps.task2.DatabaseAdapter;
import ua.ucu.edu.apps.task2.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseAdapterTest {
    @Test
    void testGetUserData() {
        БазаДаних legacyDatabase = new БазаДаних();
        Database database = new DatabaseAdapter(legacyDatabase);

        assertEquals("hello", database.getUserData());
    }

    @Test
    void testGetStatisticsData() {
        БазаДаних legacyDatabase = new БазаДаних();
        Database database = new DatabaseAdapter(legacyDatabase);

        assertEquals("hello2", database.getStatisticsData());
    }
}
