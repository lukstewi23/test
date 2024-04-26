import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void constructorTest() {
        Car car = new Car("Test Make", "Test Model", 2000);
        assertEquals("Test Make", car.getMake());
        assertEquals("Test Model", car.getModel());
        assertEquals(2000, car.getYear());
    }

    @Test
    public void getMakeTest() {
        Car car = new Car("Test Make", "Test Model", 2000);
        assertEquals("Test Make", car.getMake());
    }
}