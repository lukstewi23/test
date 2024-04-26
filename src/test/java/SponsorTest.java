import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SponsorTest {
    @Test
    public void constructorTest() {
        Sponsor sponsor = new Sponsor("Test Sponsor", "Test Industry");
        assertEquals("Test Sponsor", sponsor.getName());
        assertEquals("Test Industry", sponsor.getIndustry());
    }

    @Test
    public void getNameTest() {
        Sponsor sponsor = new Sponsor("Test Sponsor", "Test Industry");
        assertEquals("Test Sponsor", sponsor.getName());
    }
}