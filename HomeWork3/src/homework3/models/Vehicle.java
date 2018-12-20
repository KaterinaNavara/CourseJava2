package homework3.models;

public abstract class Vehicle implements Comparable<Vehicle> {
    private long price;
    private int speed;
    private int createYear;
    private int latitude;
    private int longitude;

    public Vehicle(long price, int speed, int createYear) {
        this.price = price;
        this.speed = speed;
        this.createYear = createYear;
        this.latitude = 0;
        this.longitude = 0;
    }

    public Vehicle(long price, int speed, int createYear, int latitude, int longitude) {
        this.price = price;
        this.speed = speed;
        this.createYear = createYear;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public int compareTo(Vehicle o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return Long.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", speed=" + speed +
                ", createYear=" + createYear +
                '}';
    }
}
