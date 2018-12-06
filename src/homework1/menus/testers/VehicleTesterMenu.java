package homework1.menus.testers;

import homework1.menus.ChildMenu;
import homework1.models.CVehicle;

public abstract class VehicleTesterMenu extends ChildMenu {

    private CVehicle vehicle;

    public VehicleTesterMenu(CVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void printContent() {
        System.out.println("1 - Check price");
        System.out.println("2 - Change price");
        System.out.println("3 - Check speed");
        System.out.println("4 - Change speed");
        System.out.println("5 - Check create year");
        System.out.println("6 - Change create year");
        System.out.println("7 - Check coordinates");
        System.out.println("8 - Change latitude");
        System.out.println("9 - Change longitude");
    }

    @Override
    public void processInput(String input) {
        switch (input) {
            case "1":
                checkPrice();
                break;
            case "2":
                changePrice();
                break;
            case "3":
                checkSpeed();
                break;
            case "4":
                changeSpeed();
                break;
            case "5":
                checkCreateYear();
                break;
            case "6":
                changeCreateYear();
                break;
            case "7":
                checkCoordinates();
                break;
            case "8":
                changeLatitude();
                break;
            case "9":
                changeLongitude();
                break;
            default:
                super.processInput(input);
        }
    }

    private void changeLongitude() {
        try {
            System.out.println("Enter new longitude");
            this.vehicle.setLongitude(Integer.parseInt(readInput()));
            System.out.println("Longitude has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect latitude input. Value should be integer");
        }
    }

    private void changeLatitude() {
        try {
            System.out.println("Enter new latitude");
            this.vehicle.setLatitude(Integer.parseInt(readInput()));
            System.out.println("Latitude has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect latitude input. Value should be integer");
        }
    }

    private void checkCoordinates() {
        System.out.println("Coordinates are: lat = " + vehicle.getLatitude() + "; lon = " + vehicle.getLongitude());
    }

    private void changeCreateYear() {
        try {
            System.out.println("Enter new create year");
            this.vehicle.setCreateYear(Integer.parseInt(readInput()));
            System.out.println("Create year has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect year input. Value should be integer");
        }
    }

    private void checkCreateYear() {
        System.out.println("Create year is " + vehicle.getCreateYear());
    }

    private void changeSpeed() {
        try {
            System.out.println("Enter new speed");
            this.vehicle.setSpeed(Integer.parseInt(readInput()));
            System.out.println("Speed has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect speed input. Value should be integer");
        }
    }

    private void checkSpeed() {
        System.out.println("Speed is " + vehicle.getSpeed());
    }

    private void changePrice() {
        try {
            System.out.println("Enter new price");
            this.vehicle.setPrice(Long.parseLong(readInput()));
            System.out.println("Price has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect price input. Value should be long");
        }
    }

    private void checkPrice() {
        System.out.println("Price is " + vehicle.getPrice());
    }
}
