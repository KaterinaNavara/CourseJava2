package homework1.figures_task.figures;

import homework1.figures_task.figures.Base.Point;

import java.util.Arrays;

public class PolyPointsDynamic {
    private Point[]points;
    private int count;
    public PolyPointsDynamic() {
        points = new Point[10];
        count = -1;
    }
    public void add(Point p) {
        if(count<points.length-1)
        {
            Point [] temp = Arrays.copyOf(points, points.length*2);
            //for (int i = 0; i <points.length ; i++) {
            //    temp[i]=points[i];
            //}
            points = temp;
        }
            points[++count] = p;

    }
    public Point get (int i) {
        if (i<size())
            return points[i];
        else return null;
    }
    public void set(int i, Point p) throws PolyPointsException {
        if (i < size())
            points[i] = p;
        else throw new PolyPointsException();
    }
    public int size() {
        return count+1;
    }
    public void print() {
        for (int i = 0; i < size(); i++) {

            System.out.println(points[i]);

        }
    }
}
