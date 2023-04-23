package _Primitives;

import Other.AirplaneComponent;

import java.util.ArrayList;
import java.util.List;

public class Stewardess extends AirplaneComponent {
    public List<String> stewardess = new ArrayList<>();
    public Stewardess(List<String> _pilots) {
        this.stewardess = _pilots;
    }
    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String info() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stewardess.size(); i++) {
            result.append(String.format("Pilot %d name is - \"%s\"\n", i + 1, stewardess.get(i)));
        }
        return result.toString();
    }
}
