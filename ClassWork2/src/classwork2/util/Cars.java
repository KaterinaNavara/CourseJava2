package classwork2.util;

import classwork2.controler.CarList;

public class Cars {
    public static void SortByYears(CarList cars) {
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size() - 1 - i; j++) {
                if (cars.get(j).getCreateYear() > cars.get(j + 1).getCreateYear()) {


                }
            }

        }
    }

    public static void SortByMarks(CarList cars) {
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size() - 1 - i; j++) {
                if (cars.get(j).getMark().compareTo(cars.get(j + 1).getMark()) > 0) {
                    classwork2.model.Car t = cars.get(j);
                    cars.set(j, cars.get(j + 1));
//                    cars.set(cars.get(j+1), t);

                }
            }

        }

    }


}

