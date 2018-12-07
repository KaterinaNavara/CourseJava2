package homework1.figures_task;

public class Triangle {
    private Point apexA;
    private Point apexB;
    private Point apexC;
    private Line sideAB;
    private Line sideAC;
    private Line sideBC;

    public Triangle(Point apexA, Point apexB, Point apexC) {


        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
        this.sideAC = getSideAC();
        this.sideAB = getSideAB();
        this.sideBC = getSideBC();
        //sideAB = new Line(apexA, apexB);
        //sideAC = new Line(apexA, apexC);
        //sideBC = new Line(apexB, apexC);
    }

    public Line getSideAB() {
        if(sideAB == null){
            sideAB = new Line(apexA,apexB);
        }
        return sideAB;
    }

    public Line getSideAC() {
        if(sideAC == null){
            sideAC = new Line(apexA,apexC);
        }
        return sideAC;
    }

    public Line getSideBC() {
        if(sideBC == null){
            sideBC = new Line(apexB,apexC);
        }
        return sideBC;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "sideAB=" + sideAB +
                ", sideAC=" + sideAC +
                ", sideBC=" + sideBC +
                '}';
    }
}
