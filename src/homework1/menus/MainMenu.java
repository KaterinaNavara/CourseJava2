package homework1.menus;

import homework1.VehiclesTestStore;
import homework1.menus.choosers.ChooseCarMenu;
import homework1.menus.choosers.ChoosePlaneMenu;
import homework1.menus.choosers.ChooseShipMenu;

public class MainMenu extends Menu {

    private VehiclesTestStore store;

    public MainMenu(VehiclesTestStore store) {
        this.store = store;
    }

    public void printHeader() {
        System.out.println("Choose vehicle type");
    }

    public void printContent() {
        System.out.println("1 - Plane");
        System.out.println("2 - Car");
        System.out.println("3 - Ship");
    }

    public void processInput(String input) {
        switch (input) {
            case "1":
                ChoosePlaneMenu planeMenu = new ChoosePlaneMenu(store.getPlanes());
                planeMenu.start();
                break;
            case "2":
                ChooseCarMenu carMenu = new ChooseCarMenu(store.getCars());
                carMenu.start();
                break;
            case "3":
                ChooseShipMenu shipMenu = new ChooseShipMenu(store.getShips());
                shipMenu.start();
                break;
            default:
                super.processInput(input);
        }
    }
}
