package homework3;

import homework3.models.*;

import java.util.Random;

public class VehiclesFactory {

    private static final Random RAND = new Random();

    public static Vehicle createVehicle(final int choice) {
        switch (choice) {
            case 1:
                return new Car(100_000, RAND.nextInt(160), 2011);
            case 2:
                return new Ship(200_000, RAND.nextInt(80), 1990, 100, 4629320);
            case 3:
                return new Plane(1_000_000, RAND.nextInt(1100), 2000, 10_000, 320);
            case 4:
                return new Amphibia(10_000_000, RAND.nextInt(100), 2011);
            case 5:
                return new BatMobile(50_000_000, RAND.nextInt(200), 1939);
            default:
                return null;
        }
    }

}
