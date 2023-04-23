package _Primitives;

import Other.AirClass;
import Other.AirplaneComponent;

import java.util.List;

public class Passenger extends AirplaneComponent {
    String name = null;
    AirClass ticket = AirClass.Null;
    double weight = 0.0;
    int seatNum = 0;
    @Override
    public double getWeight() {
        return weight;
    }

    public Passenger(String name, AirClass ticket, double weight, int seatNum) {
        this.name = name;
        this.ticket = ticket;
        this.weight = weight;
        this.seatNum = seatNum;
    }

    @Override
    public String info() {
        return "\n Passenger name is -" + this.name +
               "\n ticket is - " + this.ticket.name() +
               "\n seatNum is - " + seatNum;
    }
    @Override
    public void passengerBoarding(String name, AirClass ticket, double weight, int SeatNum) {
        this.name = name;
        this.ticket = ticket;
        this.weight = weight;
        this.seatNum = SeatNum;
    }
}
