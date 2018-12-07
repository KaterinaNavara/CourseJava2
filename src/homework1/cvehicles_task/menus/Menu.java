package homework1.cvehicles_task.menus;

import java.util.Scanner;

public abstract class Menu {

    private Scanner scanner;
    private boolean stopRequested;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.stopRequested = false;
    }

    public abstract void printHeader();

    public abstract void printContent();

    public void printFooter() {
        System.out.println("Q - Exit");
    }

    public void processInput(String input) {
        switch (input) {
            case "Q":
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect input " + input);
        }
    }

    public final void start() {
        do {
            printHeader();
            printContent();
            printFooter();
            String input = readInput();
            processInput(input);
        } while (!stopRequested);
    }

    protected final void requestStop() {
        this.stopRequested = true;
    }

    protected final String readInput() {
        return scanner.nextLine();
    }
}
