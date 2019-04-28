package by.bntu.fitr.model.menu;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Logger LOG = Logger.getLogger(Menu.class);
    private List<MenuEntry> menu = new ArrayList<>();
    private boolean isExit = false;

    public Menu() {
        menu.add(new MenuEntry("Exit") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public void run() {
        while (!isExit) {
            printMenu();
            Scanner reader = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(reader.nextLine());
                MenuEntry entry = menu.get(choice);
                entry.run();
            } catch (IllegalArgumentException ex) {
                LOG.warn("Menu: ", ex);
            }
        }
    }

    public void addEntry(MenuEntry entry) {
        if (entry != null)
            menu.add(entry);
    }

    public String printMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nMenu:\n");
        for (int i = 0; i < menu.size(); i++) {
            builder.append(String.format("%s - %s;\n", i, menu.get(i).getTitle()));
        }
        return builder.toString();
    }
}
