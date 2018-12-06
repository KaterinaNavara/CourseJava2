package homework1.menus.testers;

import homework1.models.CShip;

public class ShipTesterMenu extends VehicleTesterMenu {

    private CShip ship;

    public ShipTesterMenu(CShip ship) {
        super(ship);
        this.ship = ship;
    }

    @Override
    public void printHeader() {
        System.out.println("Plane checker/modifier. Choose an action");
    }

    @Override
    public void printContent() {
        super.printContent();
        System.out.println("10 - Check amount passenger");
        System.out.println("11 - Change amount passenger");
        System.out.println("12 - Check home port code");
        System.out.println("13 - Change home port code");
    }

    @Override
    public void processInput(String input) {
        switch (input) {
            case "10":
                checkAmountPassenger();
                break;
            case "11":
                changeAmountPassenger();
                break;
            case "12":
                checkPort();
                break;
            case "13":
                changePort();
                break;
            default:
                super.processInput(input);
        }
    }

    private void changePort() {
        try {
            System.out.println("Enter new port code");
            ship.setHomePortCode(Integer.parseInt(readInput()));
            System.out.println("Port code has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect port code input. Value should be integer");
        }
    }

    private void checkPort() {
        System.out.println("Home port code is " + ship.getHomePortCode());
    }

    private void changeAmountPassenger() {
        try {
            System.out.println("Enter new passengers amount");
            ship.setAmountPassenger(Integer.parseInt(readInput()));
            System.out.println("Passengers amount has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect amount input. Value should be integer");
        }
    }

    private void checkAmountPassenger() {
        System.out.println("Passengers amount is " + ship.getAmountPassenger());
    }
}
