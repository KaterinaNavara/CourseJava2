package homework3;

import homework3.behaviours.FlyAble;
import homework3.behaviours.MoveAble;
import homework3.behaviours.SwimAble;
import homework3.models.Vehicle;
import homework3.utils.ExtractByTypeUtils;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        Vehicle[] arr = new Vehicle[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = VehiclesFactory.createVehicle(i % 5 + 1);
        }

        SwimAble[] swimAbles = ExtractByTypeUtils.extractSwimables(arr);
        FlyAble[] flyAbles = ExtractByTypeUtils.extractFlyables(arr);
        MoveAble[] moveAbles = ExtractByTypeUtils.extractMoveables(arr);

        Arrays.sort(swimAbles, Comparator.comparingInt(SwimAble::swim));
        Arrays.sort(flyAbles, Comparator.comparingInt(FlyAble::fly));
        Arrays.sort(moveAbles, Comparator.comparingInt(MoveAble::move));

        System.out.println("Fastest swimmable: " + swimAbles[swimAbles.length - 1]);
        System.out.println("Fastest flyable: " + flyAbles[flyAbles.length - 1]);
        System.out.println("Fastest moveable: " + moveAbles[moveAbles.length - 1]);

    }

}
