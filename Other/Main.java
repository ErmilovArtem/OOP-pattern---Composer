package Other;

import _Composites.Airplane;
import _Composites.BusinessClass;
import _Composites.EconomyClass;
import _Composites.FirstClass;
import _Primitives.Passenger;
import _Primitives.Pilots;
import _Primitives.Stewardess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
            Airplane airplane1 = new Airplane();
            airplane1.add(new BusinessClass());
            airplane1.add(new EconomyClass());
            airplane1.add(new FirstClass());

            List<String> names = new ArrayList<>();
            names.add("John");
            names.add("Jane");

            airplane1.add(new Pilots(names));

            names = new ArrayList<>();
            names.add("John");
            names.add("Jane");
            names.add("Jade");
            names.add("Jacobs");
            names.add("Jennie");
            names.add("Jovan");

            airplane1.add(new Stewardess(names));

            Random random = new Random();

            for (int i = 0; i < 11; i++) {
                double weight = 5.0 + (60.0 - 5.0) * random.nextDouble();
                weight = weight < 5.0 ? 0.0 : weight;
                airplane1.passengerBoarding("\nPassengerFirst" + i, AirClass.FirstClass, weight, 0);
            }

            for (int i = 0; i < 21; i++) {
                double weight = 5.0 + (60.0 - 5.0) * random.nextDouble();
                weight = weight < 5.0 ? 0.0 : weight;
                airplane1.passengerBoarding("\nPassengerBuisness" + i, AirClass.BusinessClass, weight, 0);
            }

            for (int i = 0; i < 140; i++) {
                double weight = 5.0 + (30.0 - 5.0) * random.nextDouble();
                weight = weight < 5.0 ? 0.0 : weight;
                airplane1.passengerBoarding("\nPassengerEconomy" + i, AirClass.EconomyClass, weight, 0);
            }

            airplane1.passengerBoarding("To Del", AirClass.EconomyClass, 7.0, 140);

            AirplaneComponent pass = new Passenger("To Del", AirClass.EconomyClass, 7, 140);

            airplane1.remove(pass);

            System.out.print(airplane1.info());

        }
}