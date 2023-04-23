package Other;

import _Primitives.Passenger;

public abstract class AirplaneComponent {
    public void add(AirplaneComponent comp) {
        throw new UnsupportedOperationException();
    }

    public void remove(AirplaneComponent comp) {
        throw new UnsupportedOperationException();
    }

    public double getWeight() {
        return 0.0;
    }

    public abstract String info();

    public void passengerBoarding(String Name, AirClass ticket, double weight, int seatNum) {
        throw new UnsupportedOperationException();
    }
}
