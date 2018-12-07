package homework1.cvehicles_task.menus.testers;

import homework1.cvehicles_task.models.CPlane;

public class PlaneTesterMenu extends VehicleTesterMenu {

    private CPlane plane;

    public PlaneTesterMenu(CPlane plane) {
        super(plane);
        this.plane = plane;
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
        System.out.println("12 - Check height");
        System.out.println("13 - Change height");
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
                checkHeight();
                break;
            case "13":
                changeHeight();
                break;
            default:
                super.processInput(input);
        }
    }

    private void changeHeight() {
        try {
            System.out.println("Enter new height");
            plane.setHeight(Integer.parseInt(readInput()));
            System.out.println("Height has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect height input. Value should be integer");
        }
    }

    private void checkHeight() {
        System.out.println("Height is " + plane.getHeight());
    }

    private void changeAmountPassenger() {
        try {
            System.out.println("Enter new passengers amount");
            plane.setAmountPassenger(Integer.parseInt(readInput()));
            System.out.println("Passengers amount has been changed");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect amount input. Value should be integer");
        }
    }

    private void checkAmountPassenger() {
        System.out.println("Passengers amount is " + plane.getAmountPassenger());
    }


}
