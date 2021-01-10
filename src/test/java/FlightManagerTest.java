import org.junit.Before;

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
        plane = new Plane(PlaneType.CESSNA_182);
        passenger1 = new Passenger("Mark", 2);
        passenger2 = new Passenger("Chris", 1);
        passenger3 = new Passenger("Michael", 3);
        passenger4 = new Passenger("John", 2);
        passenger5 = new Passenger("Gemma", 5);
    }

}

/*
### Extensions
Create a `FlightManager` class which has methods to:
* calculate how much baggage weight should be reserved for each passenger for a flight
* calculate how much baggage weight is booked by passengers of a flight
* calculate how much overall weight reserved for baggage remains for a flight
*/
