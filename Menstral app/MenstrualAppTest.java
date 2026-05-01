import org.junit.Test;
import org.junit.Assert;

public class MenstrualAppTest {

    @Test
    public void testGetOvulation() {
        // A 28-day cycle should return day 14 (28 - 14)
        int result = MenstrualApp.getOvulation(28);
        Assert.assertEquals(14, result);
    }

    @Test
    public void testGetFertileStart() {
        // If ovulation is day 14, fertile start should be day 9 (14 - 5)
        int result = MenstrualApp.getFertileStart(14);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testGetFertileEnd() {
        // If ovulation is day 14, fertile end should be day 16 (14 + 2)
        int result = MenstrualApp.getFertileEnd(14);
        Assert.assertEquals(16, result);
    }
}
