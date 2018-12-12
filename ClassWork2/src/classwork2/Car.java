package classwork2;

public class Car {
    private String mark;
    private String model;
    private int createYear;
    private long price;


    public Car(String mark, String model, int createYear, long price) {
        this.mark = mark;
        this.model = model;
        this.createYear = createYear;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", createYear=" + createYear +
                ", price=" + price +
                '}';
    }
}
