import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Plane plane;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;


    @Before
    public void setUp(){
        flight = new Flight("BA1234", "PER", "EDI", "13:00");
        plane = new Plane(PlaneType.BOEING_737);
        passenger1 = new Passenger("Mark", 1);
        passenger2 = new Passenger("Chris", 1);
        passenger3 = new Passenger("Michael", 1);
        passenger4 = new Passenger("John", 1);
        passenger5 = new Passenger("Gemma", 1);
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(5500, FlightManager.getBaggageCapacity(plane));
    }

    @Test
    public void canGetPassengerCapacity() {
        assertEquals(400, FlightManager.getTravellerCapacity(plane));
    }
    @Test
    public void totalWeightReservedForPassengers() {
        assertEquals(2750, FlightManager.getPassengerBaggageCapacity(plane));
    }
    @Test
    public void weightAllowanceForOneBagPerPassinger(){
        assertEquals(13, FlightManager.getPassengerBaggageAllowance(plane), 0.01);
    }

}

/*
### Extensions
Create a `FlightManager` class which has methods to:
* calculate how much baggage weight should be reserved for each passenger for a flight
* calculate how much baggage weight is booked by passengers of a flight
* calculate how much overall weight reserved for baggage remains for a flight
*/
