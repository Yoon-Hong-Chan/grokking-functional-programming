package chapter_2_pure_function;

import java.util.ArrayList;
import java.util.List;

public class TipCalculatorRefactor {

    private List<String> names = new ArrayList<>();
    private int tipPercentage = 0;

    public List<String> addPerson(List<String> names,
                                  String name) {
        List<String> updated = new ArrayList<>(names);
        updated.add(name);
        return updated;
    }

    public List<String> getNames() {
        return names;
    }

    public static int getTipPercentage(List<String> list) {
        int tipPercentage = 0;
        if(list.size() > 5) {
            tipPercentage = 20;
        } else if(list.size() > 0) {
            tipPercentage = 10;
        }
        return tipPercentage;
    }
}
