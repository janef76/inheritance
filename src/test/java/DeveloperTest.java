import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        this.developer = new Developer("Jack", 2, 500);
    }

    @Test
    public void hasName(){
        assertEquals("Jack", developer.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(2, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertTrue(500 == developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10);
        assertTrue(510 == developer.getSalary());
    }

    @Test
    public void canReceiveBonus() {
        double result = developer.payBonus();
        assertTrue(5 == result);
    }

}
