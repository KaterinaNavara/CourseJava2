package homework3.models;

import homework3.behaviours.SwimAble;

public class Ship extends Vehicle implements SwimAble {
    private int amountPassenger;
    private int homePortCode;

    public Ship(long price, int speed, int creatYear, int amountPassenger, int homePortCode) {
        super(price, speed, creatYear);
        this.amountPassenger = amountPassenger;
        this.homePortCode = homePortCode;
    }

    public int getAmountPassenger() {
        return amountPassenger;
    }

    public void setAmountPassenger(int amountPassenger) {
        this.amountPassenger = amountPassenger;
    }

    public int getHomePortCode() {
        return homePortCode;
    }

    public void setHomePortCode(int homePortCode) {
        this.homePortCode = homePortCode;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "amountPassenger=" + amountPassenger +
                ", homePortCode=" + homePortCode +
                "} " + super.toString();
    }

    @Override
    public int swim() {
        return this.getSpeed() / 2;
    }
}
