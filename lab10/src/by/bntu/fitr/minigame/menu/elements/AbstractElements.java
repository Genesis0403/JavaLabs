package by.bntu.fitr.minigame.menu.elements;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

abstract public class AbstractElements<T> {
    protected Map<String, T> elem = new LinkedHashMap<>();

    public List<String> getKeys() {
        return new ArrayList<String>(elem.keySet());
    }

    private String getKey(int choice) {
        return getKeys().get(choice - 1);
    }

    public T getValue(int choice) {
        return elem.get(getKey(choice));
    }
}
