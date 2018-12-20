package homework3.models;

import homework3.behaviours.MoveAble;

public class Car extends Vehicle implements MoveAble {
    public Car(long price, int speed, int createYear) {
        super(price, speed, createYear);
    }

    public Car(long price, int speed, int createYear, int latitude, int longitude) {
        super(price, speed, createYear, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }

    @Override
    public int move() {
        return this.getSpeed();
    }
}
