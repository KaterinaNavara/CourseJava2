package homework1.cvehicles_task.models;

public class CShip extends CVehicle {
    private int amountPassenger;
    private int homePortCode;

    public CShip(long price, int speed, int creatYear, int amountPassenger, int homePortCode) {
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
        return "homework1.cvehicles_task.models.CShip{" +
                "amountPassenger=" + amountPassenger +
                ", homePortCode=" + homePortCode +
                "} " + super.toString();
    }
}
