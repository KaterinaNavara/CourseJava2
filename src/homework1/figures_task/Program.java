package homework1.figures_task;

public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,3);
        System.out.println(p1);
        System.out.println(p2);
        ColorPoint cp1 = new ColorPoint(1,23,33);
        ColorPoint cp2 = new ColorPoint(12,17,21);
        System.out.println(cp1);
        System.out.println(cp2);
        ColorPointAgr cpa1 = new ColorPointAgr(p1, 33);
        System.out.println(cpa1);
        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        Line l2 = new Line(6,6,7,7);
        System.out.println(l2);
        Line l3 = new Line(new Point(8,8), new Point(9,9));
        System.out.println(l3);
        Line l4 = new Line(l2.getBegin(), l3.getEnd());
        System.out.println(l4);
        ColorLine cl1 = new ColorLine(p1,p2,23);
        System.out.println(cl1);
        Figure[] masObj = new Figure[5];
        masObj[0] = p1;
        masObj[1] = cp1;
        masObj[2] = cpa1;
        masObj[3] = l1;
        masObj[4] = new Point();
        for (int i = 0; i<masObj.length; i++) {
            System.out.println(masObj[i]);
        }
        ColorTriangle tr1 = new ColorTriangle(p1, p2, new Point(4,7), 4445);
        System.out.println(tr1);
    }
}
