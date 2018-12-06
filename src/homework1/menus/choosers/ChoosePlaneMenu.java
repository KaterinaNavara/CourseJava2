package homework1.menus.choosers;

import homework1.menus.ChildMenu;
import homework1.menus.testers.PlaneTesterMenu;
import homework1.models.CPlane;

public class ChoosePlaneMenu extends ChildMenu {

    private CPlane[] planes;

    public ChoosePlaneMenu(CPlane[] planes) {
        this.planes = planes;
    }

    @Override
    public void printHeader() {
        System.out.println("Choose a plane");
    }

    @Override
    public void printContent() {
        for (int i = 0; i < planes.length; i++) {
            System.out.println((i + 1) + " - " + planes[i].toString());
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

        if (realInput >= 1 && realInput <= planes.length) {
            PlaneTesterMenu planeTesterMenu = new PlaneTesterMenu(planes[realInput - 1]);
            planeTesterMenu.start();
        } else {
            super.processInput(input);
        }
    }

}
