package homework1.figures_task;

import java.util.Arrays;

public class Polygon {

    private Point[] points;
    private Line[] lines;

    public Polygon(Point[] points) {
        this.points = points;
    }



    public Polygon(Point p1, Point p2, Point p3, Point ... extraPoints) {
        points = new Point[extraPoints.length + 3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        for (int i = 0; i<extraPoints.length; i++) {
            points[i+3] = extraPoints[i];
        }

        lines = new Line[points.length];

        for (int i = 0; i<points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i+1]);
        }
        lines[points.length-1] = new Line(points[points.length-1],points[0]);


    }

    @Override
    public String toString() {
        return "Polygon{" +
                "lines=" + Arrays.toString(lines) +
                '}';
    }
}
