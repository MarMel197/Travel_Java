public class FlightManager {

    private double baggageAllowance;
    private double flightBaggageTotal;
    private double remainingAllowance;

    public FlightManager(double baggageAllowance, double flightBaggageTotal, double remainingAllowance){
        this.baggageAllowance = baggageAllowance;
        this.flightBaggageTotal = flightBaggageTotal;
        this.remainingAllowance = remainingAllowance;
    }

    public static int getBaggageCapacity(Plane plane) {
        return plane.getWeightFromEnum();
    }
    public static int getTravellerCapacity(Plane plane) {
        return plane.getCapacityFromEnum();
    }

    public static int getPassengerBaggageCapacity(Plane plane) {
        return plane.getWeightFromEnum() / 2;
    }

    public static double getPassengerBaggageAllowance(Plane plane) {
        return plane.getWeightFromEnum() / plane.getCapacityFromEnum();
    }


//    public int returnAvailableSeats(Plane plane){
//        return plane.getCapacityFromEnum() - passengerCount();
//    }
}
/*
### Extensions
Create a `FlightManager` class which has methods to:
* calculate how much baggage weight should be reserved for each passenger for a flight
* calculate how much baggage weight is booked by passengers of a flight
* calculate how much overall weight reserved for baggage remains for a flight
*/