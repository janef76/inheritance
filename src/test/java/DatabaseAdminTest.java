import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        this.databaseAdmin = new DatabaseAdmin("Bill", 3, 300);
    }

    @Test
    public void hasName() {
        assertEquals("Bill", databaseAdmin.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(3, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertTrue(300 == databaseAdmin.getSalary());
    }

    @Test
    public void canGetRaise() {
        databaseAdmin.raiseSalary(40);
        assertTrue(340 == databaseAdmin.getSalary());
    }

    @Test
    public void canReceiveBonus() {
        double result = databaseAdmin.payBonus();
        assertTrue(3 == result);
    }
}
