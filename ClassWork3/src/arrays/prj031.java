package arrays;

import java.util.Arrays;
import java.util.Comparator;

interface MoveAble{
    int move();
}
class Car implements MoveAble, Comparable<Car>{
    private int year;
    private String mark;
    private int speed;


    public Car(int year, String mark) {
        this.year = year;
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int move(){
        return speed;
    }
    @Override
    public int compareTo(Car car){
        return this.year-car.year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mark='" + mark + '\'' +
                ", speed=" + speed +
                '}';
    }
}
class CompareByYear implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2){
        return c1.getYear() - c2.getYear();
    }

}
class CompareByName implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2){
        return c1.getMark().compareTo(c2.getMark());
    }
}
public class prj031 {
    public static void main(String[] args) {
        int mas[] = {1,2,-3,4,5,0};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        String strMas [] = {"Vasya", "Petya", "Alla"};
        Arrays.sort(strMas);
        System.out.println(Arrays.toString(strMas));
        Car carMas [] = new Car[3];
        carMas[0] = new Car(12,"N");
        carMas[1] = new Car(4,"F");
        carMas[2] = new Car(99,"A");
        Arrays.sort(carMas, (c1, c2) -> c1.getYear() - c2.getYear());




        System.out.println(Arrays.toString(carMas));
        Arrays.sort(carMas,
                new Comparator<Car>() {
                    @Override
                    public int compare(Car c1, Car c2) {

                            return c1.getMark().compareTo(c2.getMark());

                    }
                }
        );
        System.out.println(Arrays.toString(carMas));




    }
}
