package classwork2;
import java.util.Arrays;
import java.util.Calendar;

public class CarList {
    private Car[] cars;
    private int count;

    public CarList() {
        cars = new Car[10];
        count = -1;

    }

    public void add(Car car) {
        if(count == cars.length-1) {
            cars = Arrays.copyOf(cars,cars.length*2);
        }
        cars[++count] = car;

    }

    public Car ger(int i) {
        return cars[i];
    }

    public int size() {
        return count + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(cars[i]);
        }
    }

    public void printCarsByMark(String mark) {
        System.out.println("Список машин марки " + mark);
        for (int i = 0; i < size(); i++) {
            if (cars[i].getMark().equals(mark)) {
                System.out.println(cars[i].toString());
            }
        }

    }

    public void printCarsByYearAndModel(int year, String model) {
        System.out.println("Список машин модели  " + model + " и старше " + year + " лет");
            Calendar now = Calendar.getInstance();
        for (int i = 0; i < size(); i++) {
            if (cars[i].getCreateYear() <now.get(Calendar.YEAR)-year && cars[i].getModel().equals(model)) {
                System.out.println(cars[i].toString());
            }
        }


    }

    public void printCarsByYearAndPrice(int year, int price) {
        System.out.println("Список машин " + year + " года выпуска и дороже  " + price);
        for (int i = 0; i <size() ; i++) {
            if (cars[i].getCreateYear() == year && cars[i].getPrice() > price) {
                System.out.println(cars[i].toString());
            }

        }
    }


}

