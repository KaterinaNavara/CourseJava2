package homework1.menus;

public abstract class ChildMenu extends Menu {

    @Override
    public final void printFooter() {
        System.out.println("0 - Back");
        super.printFooter();
    }

    @Override
    public void processInput(String input) {
        switch (input) {
            case "0":
                requestStop();
                break;
            default:
                super.processInput(input);
        }
    }
}
