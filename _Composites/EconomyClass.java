package _Composites;

import Other.AirClass;
import Other.AirplaneComponent;
import _Primitives.Passenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EconomyClass  extends AirplaneComponent {
    int lastSeat = 0;
    List<AirplaneComponent> passengers = new ArrayList<AirplaneComponent>();
    @Override
    public void add(AirplaneComponent comp){
        passengers.add(comp);
    }

    @Override
    public void remove(AirplaneComponent comp){
        for(int i = 0; i < 150; i++){
            if(Objects.equals(passengers.get(i).info(), comp.info())){
                passengers.set(i, new Passenger(null, AirClass.Null, 0,-1));
            }
        }
    }

    @Override
    public double getWeight() {
        double accum = 0;
        for(AirplaneComponent passenger : passengers){
            accum =+ passenger.getWeight();
        }
        return accum;
    }

    @Override
    public String info() {
        String accum = "Economy class -";
        for(AirplaneComponent passenger : passengers) {
            accum = accum + passenger.info();
            if(passenger.getWeight() < 0.1){
                accum = accum + "\nБАГАЖ СНЯТ С РЕЙСА!" ;
            }
            accum = accum + "\n weight is - " + passenger.getWeight() ;
        }
        return accum;
    }
    @Override
    public void passengerBoarding(String name, AirClass ticket, double weight, int SeatNum) {
        if(lastSeat == passengers.size()){
            System.out.print("Economy Class is full");
            return;
        }
        if(weight > 25){
            System.out.print("weight is bigger than 25 for economy class! baggage is 0 now");
            weight = 0;
        }
        passengers.get(lastSeat).passengerBoarding(name, ticket, weight, lastSeat);
        lastSeat += 1;
    }
}


