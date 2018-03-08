import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        this.manager = new Manager("Bob", 1, 100.00, "Marketing");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(1, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertTrue(100.00 == manager.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Marketing",  manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertTrue(110.00 == manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        double result = manager.payBonus();
        assertTrue(1.00 == result);
    }
}
