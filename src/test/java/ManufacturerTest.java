import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManufacturerTest {
    @Test
    public void constructorTest() {
        Manufacturer manufacturer = new Manufacturer("Test Manufacturer", "Test Country");
        assertEquals("Test Manufacturer", manufacturer.getName());
        assertEquals("Test Country", manufacturer.getCountry());
    }

    @Test
    public void getNameTest() {
        Manufacturer manufacturer = new Manufacturer("Test Manufacturer", "Test Country");
        assertEquals("Test Manufacturer", manufacturer.getName());
    }
}