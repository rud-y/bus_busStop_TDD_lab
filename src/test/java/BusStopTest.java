import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Person person2;

    @Before
    public void before() {
        busStop = new BusStop("Haymarket");
        person = new Person();
        person2 = new Person();
    }

    @Test
    public void busStopHasName() {
        assertEquals("Haymarket", busStop.getName());
    }

    @Test
    public void busStopHasNoQueue() {
        assertEquals(0, busStop.getQueueLength() );
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.add(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.add(person);
        busStop.add(person2);
        busStop.remove(person);
        assertEquals(1, busStop.getQueueLength());
    }


}
