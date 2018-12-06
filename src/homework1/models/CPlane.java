package homework1.models;

public class CPlane extends CVehicle {
    private int height;
    private int amountPassenger;

    public CPlane(long price, int speed, int createYear, int height, int amountPassenger) {
        super(price, speed, createYear);
        this.height = height;
        this.amountPassenger = amountPassenger;
    }

    public CPlane(long price, int speed, int createYear, int latitude, int longitude, int height, int amountPassenger) {
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
        return "homework1.models.CPlane{" +
                "height=" + height +
                ", amountPassenger=" + amountPassenger +
                "} " + super.toString();
    }
}
