import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Mary", 4, 1000, "Engineering", 5000);
    }

    @Test
    public void hasName() {
        assertEquals("Mary", director.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals(4, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertTrue(1000 == director.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Engineering", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertTrue(5000 == director.getBudget());
    }

    @Test
    public void hasRaise() {
        director.raiseSalary(100);
        assertTrue(1100 == director.getSalary());
    }

    @Test
    public void canGetBonus() {
        double result = director.payBonus();
        assertTrue(10 == result);
    }


}
