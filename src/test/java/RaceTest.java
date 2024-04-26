import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceTest {
    @Test
    public void constructorTest() {
        Race race = new Race("Test Race", 5000, 10);
        assertEquals("Test Race", race.getName());
        assertEquals(5000, race.getDistance());
        assertEquals(10, race.getMaxParticipants());
    }

    @Test
    public void getNameTest() {
        Race race = new Race("Test Race", 5000, 10);
        assertEquals("Test Race", race.getName());
    }
}