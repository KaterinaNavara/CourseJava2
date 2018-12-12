package homework1.cvehicles_task;

import homework1.cvehicles_task.models.CCar;
import homework1.cvehicles_task.models.CPlane;
import homework1.cvehicles_task.models.CShip;

public class VehiclesTestStore {

    private CCar[] cars;
    private CPlane[] planes;
    private CShip[] ships;

    public VehiclesTestStore() {
        cars = new CCar[3];
        planes = new CPlane[3];
        ships = new CShip[3];

        initTestData();
    }

    public CCar[] getCars() {
        return cars;
    }

    public CPlane[] getPlanes() {
        return planes;
    }

    public CShip[] getShips() {
        return ships;
    }

    private void initTestData() {
        cars[0] = new CCar(10000,0,2000);
        cars[1] = new CCar(20000,60,2011);
        cars[2] = new CCar(5000,40,1989);

        planes[0] = new CPlane(0,0,0,0,0);
        planes[1] = new CPlane(1,1,1,1,1);
        planes[2] = new CPlane(2,2,2,2,2);

        ships[0] = new CShip(3,3,3,3,3);
        ships[1] = new CShip(4,4,4,4,4);
        ships[2] = new CShip(5,5,5,5,5);
    }

}
