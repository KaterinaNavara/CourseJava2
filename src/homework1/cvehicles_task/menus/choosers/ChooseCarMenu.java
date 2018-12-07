package homework1.cvehicles_task.menus.choosers;

import homework1.cvehicles_task.menus.ChildMenu;
import homework1.cvehicles_task.menus.testers.CarTesterMenu;
import homework1.cvehicles_task.models.CCar;

public class ChooseCarMenu extends ChildMenu {

    private CCar[] cars;

    public ChooseCarMenu(CCar[] cars) {
        this.cars = cars;
    }

    @Override
    public void printHeader() {
        System.out.println("Choose a car");
    }

    @Override
    public void printContent() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + " - " + cars[i].toString());
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

        if (realInput >= 1 && realInput <= cars.length) {
            CarTesterMenu carTesterMenu = new CarTesterMenu(cars[realInput - 1]);
            carTesterMenu.start();
        } else {
            super.processInput(input);
        }
    }

}
