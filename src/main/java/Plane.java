public class Plane {
    private PlaneType aircraft;

    public Plane(PlaneType aircraft){
        this.aircraft = aircraft;
    }

    public PlaneType getAircraft() {
        return aircraft;
    }

    public int getWeightFromEnum(){
        return this.aircraft.getTotalWeight();
    }
}
