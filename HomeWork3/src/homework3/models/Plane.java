package homework3.models;

import homework3.behaviours.FlyAble;

public class Plane extends Vehicle implements FlyAble {
    private int height;
    private int amountPassenger;

    public Plane(long price, int speed, int createYear, int height, int amountPassenger) {
        super(price, speed, createYear);
        this.height = height;
        this.amountPassenger = amountPassenger;
    }

    public Plane(long price, int speed, int createYear, int latitude, int longitude, int height, int amountPassenger) {
        super(price, speed, createYear, latitude, longitude);
        this.height = height;
        this.amountPassenger = amountPassenger;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAmountPassenger() {
        return amountPassenger;
    }

    public void setAmountPassenger(int amountPassenger) {
        this.amountPassenger = amountPassenger;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", amountPassenger=" + amountPassenger +
                "} " + super.toString();
    }

    @Override
    public int fly() {
        return this.getSpeed() * 10;
    }
}
