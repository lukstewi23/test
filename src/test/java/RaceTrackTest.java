import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceTrackTest {
    @Test
    public void constructorTest() {
        RaceTrack raceTrack = new RaceTrack("Test Track", 5000);
        assertEquals("Test Track", raceTrack.getName());
        assertEquals(5000, raceTrack.getLength());
    }

    @Test
    public void getNameTest() {
        RaceTrack raceTrack = new RaceTrack("Test Track", 5000);
        assertEquals("Test Track", raceTrack.getName());
    }
}