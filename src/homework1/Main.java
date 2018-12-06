package homework1;

import homework1.menus.MainMenu;

public class Main {

    public static void main(String[] args) {

        VehiclesTestStore store = new VehiclesTestStore();

        MainMenu menu = new MainMenu(store);

        menu.start();

    }

}
