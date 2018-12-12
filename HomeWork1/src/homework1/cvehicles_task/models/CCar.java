package homework1.cvehicles_task.models;

public class CCar extends CVehicle {
    public CCar(long price, int speed, int createYear) {
        super(price, speed, createYear);
    }

    public CCar(long price, int speed, int createYear, int latitude, int longitude) {
        super(price, speed, createYear, latitude, longitude);
    }

    @Override
    public String toString() {
        return "CCar{} " + super.toString();
    }
}
