package classwork2;


public class Main {
    public static void main(String[] args) {
        CarList carList = new CarList();
        carList.add(new Car("Ford", "XX", 1990,10000));
        carList.add(new Car("Ford", "NX", 2001,25000));
        carList.add(new Car("BMW", "AS",1999, 25000));
        carList.add(new Car("BMW", "MS",2005, 45000));
        carList.add(new Car("BMW", "MS",2017, 55000));
        carList.add(new Car("BMW", "MS",2014, 50000));
        carList.add(new Car("BMW", "MS",2012, 45000));
        carList.add(new Car("BMW", "MS",2016, 54000));
        carList.add(new Car("BMW", "MS",2011, 42000));
        carList.add(new Car("BMW", "MS",2013, 51000));
        carList.add(new Car("Ford", "NX", 2011,35000));
        carList.add(new Car("Ford", "NX", 2011,25000));
        carList.add(new Car("Ford", "NX", 2011,30000));
        carList.add(new Car("BMW", "MS",2011, 29000));
        carList.add(new Car("BMW", "MS",2011, 42000));
        carList.add(new Car("BMW", "MS",2011, 44000));

        carList.printCarsByMark("Ford");
        carList.printCarsByYearAndModel(5,"MS");
        carList.printCarsByYearAndPrice(2011,30000);

    }
}
