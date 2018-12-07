package homework1.cvehicles_task.menus.choosers;

import homework1.cvehicles_task.menus.ChildMenu;
import homework1.cvehicles_task.menus.testers.ShipTesterMenu;
import homework1.cvehicles_task.models.CShip;

public class ChooseShipMenu extends ChildMenu {

    private CShip[] ships;

    public ChooseShipMenu(CShip[] ships) {
        this.ships = ships;
    }

    @Override
    public void printHeader() {
        System.out.println("Choose a ship");
    }

    @Override
    public void printContent() {
        for (int i = 0; i < ships.length; i++) {
            System.out.println((i + 1) + " - " + ships[i].toString());
        }
    }

    @Override
    public void processInput(String input) {

        int realInput = -1;

        try {
            realInput = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            super.processInput(input);
            return;
        }

        if (realInput >= 1 && realInput <= ships.length) {
            ShipTesterMenu shipTesterMenu = new ShipTesterMenu(ships[realInput - 1]);
            shipTesterMenu.start();
        } else {
            super.processInput(input);
        }
    }

}
