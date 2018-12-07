package homework1.figures_task;

public class ColorPointAgr extends Figure {
    private Point point;
    private int colot;

    public ColorPointAgr(Point p, int c) {
        point = p;
        colot = c;

    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getColot() {
        return colot;
    }

    public void setColot(int colot) {
        this.colot = colot;
    }

    @Override
    public String toString() {
        return "ColorPointAgr{" +
                "point=" + point +
                ", colot=" + colot +
                '}';
    }

}
