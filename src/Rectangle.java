
import java.awt.*;


public class Rectangle implements Shape {

    private Point leftUp;
    private int a, b;

    public Rectangle(Point leftUp, int a, int b ) {
        this.leftUp = leftUp;
        this.a = a;
        this.b = b;
    }

    public Polygon getPolygon() {
        Polygon outline = new Polygon();
        outline.addPoint(leftUp.getX(), leftUp.getY());
        outline.addPoint(leftUp.getX()+a, leftUp.getY());
        outline.addPoint(leftUp.getX()+a, leftUp.getY()+b);
        outline.addPoint(leftUp.getX(), leftUp.getY()+b);
        return outline;
    }

}