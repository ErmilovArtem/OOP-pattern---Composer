package _Primitives;

import Other.AirClass;
import Other.AirplaneComponent;

import java.util.ArrayList;
import java.util.List;

public class Pilots extends AirplaneComponent {
    public List<String> pilots = new ArrayList<>();
    public Pilots(List<String> _pilots) {
        this.pilots = _pilots;
    }
    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String info() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pilots.size(); i++) {
            result.append(String.format("Pilot %d name is - \"%s\"\n", i + 1, pilots.get(i)));
        }
        return result.toString();
    }
}
