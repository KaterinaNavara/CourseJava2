package homework3.models;

import homework3.behaviours.SwimAble;

public class Amphibia extends Car implements SwimAble {

    public Amphibia(long price, int speed, int createYear) {
        super(price, speed, createYear);
    }

    public Amphibia(long price, int speed, int createYear, int latitude, int longitude) {
        super(price, speed, createYear, latitude, longitude);
    }

    @Override
    public int swim() {
        return this.getSpeed() / 2;
    }

    @Override
    public String toString() {
        return "Amphibia " + super.toString();
    }
}
