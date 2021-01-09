import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4; 
    
    @Before
    public void setUp(){
        flight = new Flight("BA1234", "PER", "EDI", "13:00");
        plane = new Plane(PlaneType.CESSNA_182);
        passenger1 = new Passenger("Mark", 2);
        passenger2 = new Passenger("Chris", 1);
        passenger3 = new Passenger("Michael", 3);
        passenger4 = new Passenger("John", 2);
    }
    
    @Test
    public void canGetFlightNumber(){
        assertEquals("BA1234", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("PER", flight.getDestination());
    }
}
