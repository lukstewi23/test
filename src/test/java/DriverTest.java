import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {
    @Test
    public void constructorTest() {
        Driver driver = new Driver("Test Driver", 30, "Test Team");
        assertEquals("Test Driver", driver.getName());
        assertEquals(30, driver.getAge());
        assertEquals("Test Team", driver.getTeam());
    }

    @Test
    public void getNameTest() {
        Driver driver = new Driver("Test Driver", 30, "Test Team");
        assertEquals("Test Driver", driver.getName());
    }
}