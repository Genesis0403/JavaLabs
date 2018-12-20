package by.bntu.fitr.minigame.view;

import java.util.List;

public class ElementsPrinter {
    public <T> void print(List<T> elements) {
        System.out.println();
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(i + 1 + ". " + elements.get(i));
        }
    }
}
