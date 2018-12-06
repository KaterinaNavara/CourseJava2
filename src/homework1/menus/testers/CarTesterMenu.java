package homework1.menus.testers;

import homework1.models.CCar;

public class CarTesterMenu extends VehicleTesterMenu {

    public CarTesterMenu(CCar car) {
        super(car);
    }

    @Override
    public void printHeader() {
        System.out.println("Car checker/modifier. Choose an action");
    }
}
