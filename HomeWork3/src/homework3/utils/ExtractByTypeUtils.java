package homework3.utils;

import homework3.behaviours.FlyAble;
import homework3.behaviours.MoveAble;
import homework3.behaviours.SwimAble;
import homework3.models.Car;
import homework3.models.Plane;
import homework3.models.Vehicle;

import java.util.Arrays;

public class ExtractByTypeUtils {

    public static Car[] extractCars(Vehicle[] vehicles) {

        Car[] result = new Car[vehicles.length];
        int counter = -1;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car) {
                result[++counter] = (Car) vehicles[i];
            }
        }

        return counter == -1 ? new Car[0] : Arrays.copyOf(result, counter + 1);
    }

    public static Plane[] extractPlanes(Vehicle[] vehicles) {

        Plane[] result = new Plane[vehicles.length];
        int counter = -1;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Plane) {
                result[++counter] = (Plane) vehicles[i];
            }
        }

        return counter == -1 ? new Plane[0] : Arrays.copyOf(result, counter + 1);
    }

    public static SwimAble[] extractSwimables(Vehicle[] vehicles) {

        SwimAble[] result = new SwimAble[vehicles.length];
        int counter = -1;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof SwimAble) {
                result[++counter] = (SwimAble) vehicles[i];
            }
        }

        return counter == -1 ? new SwimAble[0] : Arrays.copyOf(result, counter + 1);
    }

    public static FlyAble[] extractFlyables(Vehicle[] vehicles) {

        FlyAble[] result = new FlyAble[vehicles.length];
        int counter = -1;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof FlyAble) {
                result[++counter] = (FlyAble) vehicles[i];
            }
        }

        return counter == -1 ? new FlyAble[0] : Arrays.copyOf(result, counter + 1);
    }

    public static MoveAble[] extractMoveables(Vehicle[] vehicles) {

        MoveAble[] result = new MoveAble[vehicles.length];
        int counter = -1;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof MoveAble) {
                result[++counter] = (MoveAble) vehicles[i];
            }
        }

        return counter == -1 ? new MoveAble[0] : Arrays.copyOf(result, counter + 1);
    }

}
