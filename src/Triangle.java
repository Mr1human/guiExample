
import java.awt.*;

public class Triangle implements Shape {
    private Point point1;
    private Point point2;
    private Point point3;


    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Polygon getPolygon() {
        Polygon outline = new Polygon();
        outline.addPoint(point1.getX(), point1.getY());
        outline.addPoint(point2.getX(), point2.getY());
        outline.addPoint(point3.getX(), point3.getY());
        return outline;
    }
}
