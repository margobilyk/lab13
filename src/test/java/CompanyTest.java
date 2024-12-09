import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.task3.Company;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    void testGettersAndSetters() {
        Company company = new Company();
        company.setName("Tech Corp");
        company.setDescription("A technology company");

        assertEquals("Tech Corp", company.getName());
        assertEquals("A technology company", company.getDescription());
    }
}
