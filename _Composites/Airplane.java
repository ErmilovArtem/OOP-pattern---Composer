package _Composites;

import Other.AirClass;
import Other.AirplaneComponent;
import _Primitives.Passenger;
import _Primitives.Stewardess;

import java.util.List;
import java.util.Objects;

public class Airplane extends AirplaneComponent {
    double max_weight = 5000;
    AirplaneComponent Class1 = null;
    AirplaneComponent Class2 = null;
    AirplaneComponent Class3 = null;
    AirplaneComponent Pilots = null;
    AirplaneComponent Stewardess = null;
    @Override
    public void add(AirplaneComponent comp) {
        if (Class1 == null) {
            Class1 = comp;
            for(int i = 0; i < 20; i ++)
                Class1.add(new Passenger(null, AirClass.Null, 0,0));
        } else if (Class2 == null) {
            Class2 = comp;
            for(int i = 0; i < 150; i ++)
                Class2.add(new Passenger(null, AirClass.Null, 0,0));
        } else if (Class3 == null) {
            Class3 = comp;
            for(int i = 0; i < 10; i ++)
                Class3.add(new Passenger(null, AirClass.Null, 0,0));
        }
         else if (Pilots == null) {
            Pilots = comp;
        }
         else if (Stewardess == null) {
            Stewardess = comp;
         };
    }

    @Override
    public void remove(AirplaneComponent comp) {
        if (Objects.equals(Class1, comp)) {
            Class1 = null;
        } else if (Objects.equals(Class2, comp)) {
            Class2 = null;
        } else if (Objects.equals(Class3, comp)) {
            Class3 = null;
        } else if (Objects.equals(Pilots, comp)) {
            Pilots = null;
        } else if (Objects.equals(Stewardess, comp)) {
            Stewardess = null;
        }
        Class1.remove(comp);
        Class2.remove(comp);
        Class3.remove(comp);

    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String info() {
        return Class1.info() + Class2.info() + Class3.info() + Pilots.info() + Stewardess.info();
    }
    @Override
    public void passengerBoarding(String name, AirClass ticket, double weight, int SeatNum) {
        if(max_weight < 0){
            System.out.print(max_weight);
            weight = 0;
        }
        if(ticket == AirClass.BusinessClass)
            Class1.passengerBoarding(name, ticket, weight, SeatNum);
        if(ticket == AirClass.EconomyClass)
            Class2.passengerBoarding(name, ticket, weight, SeatNum);
        if(ticket == AirClass.FirstClass)
            Class3.passengerBoarding(name, ticket, weight, SeatNum);
    }
}
