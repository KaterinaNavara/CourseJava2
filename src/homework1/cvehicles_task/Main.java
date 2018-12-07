package homework1.cvehicles_task;

import homework1.cvehicles_task.menus.MainMenu;

public class Main {

    public static void main(String[] args) {

        VehiclesTestStore store = new VehiclesTestStore();

        MainMenu menu = new MainMenu(store);

        menu.start();

    }

}
