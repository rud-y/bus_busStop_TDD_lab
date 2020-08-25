import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Haymarket");
    }

    @Test
    public void busStopHasName() {
        assertEquals("Haymarket", busStop.getName());
    }
}
