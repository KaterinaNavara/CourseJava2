package homework1.cvehicles_task.menus.testers;

import homework1.cvehicles_task.models.CCar;

public class CarTesterMenu extends VehicleTesterMenu {

    public CarTesterMenu(CCar car) {
        super(car);
    }

    @Override
    public void printHeader() {
        System.out.println("Car checker/modifier. Choose an action");
    }
}
