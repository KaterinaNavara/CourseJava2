package homework3.models;

import homework3.behaviours.FlyAble;

public class BatMobile extends Amphibia implements FlyAble {

    public BatMobile(long price, int speed, int createYear) {
        super(price, speed, createYear);
    }

    public BatMobile(long price, int speed, int createYear, int latitude, int longitude) {
        super(price, speed, createYear, latitude, longitude);
    }

    @Override
    public int fly() {
        return this.getSpeed() * 10;
    }

    @Override
    public String toString() {
        return "BatMobile " + super.toString();
    }
}
