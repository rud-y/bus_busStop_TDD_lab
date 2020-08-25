import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("South Gyle", 80);
        person = new Person();

    }

    @Test
    public void startsWithZeroPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerIfBusIsNotFull() {
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassengerBusIsFull() {
        for(int i = 0; i < 80; i++){
            bus.addPassenger(person);
        }
        bus.addPassenger(person);
        assertEquals(80, bus.getNumberOfPassengers());

    }

}
