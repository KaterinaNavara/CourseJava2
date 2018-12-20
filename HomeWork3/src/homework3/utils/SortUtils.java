package homework3.utils;

import homework3.models.Vehicle;

import java.util.Arrays;

public class SortUtils {

    public static void naturalSort(Vehicle[] array) {
        Arrays.sort(array);
    }

    public static void sortBySpeed(Vehicle[] array) {
        Arrays.sort(array, (v1, v2) -> v1.getSpeed() - v2.getSpeed());
    }

}
