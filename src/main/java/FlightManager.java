public class FlightManager {

    private double baggageAllowance;
    private double flightBaggageTotal;
    private double remainingAllowance;

    public FlightManager(double baggageAllowance, double flightBaggageTotal, double remainingAllowance){
        this.baggageAllowance = baggageAllowance;
        this.flightBaggageTotal = flightBaggageTotal;
        this.remainingAllowance = remainingAllowance;
    }
}
/*
### Extensions
Create a `FlightManager` class which has methods to:
* calculate how much baggage weight should be reserved for each passenger for a flight
* calculate how much baggage weight is booked by passengers of a flight
* calculate how much overall weight reserved for baggage remains for a flight
*/