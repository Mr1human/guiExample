public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(new Point(50,50), 100, 200);
        shapes[1] = new Triangle(new Point(400,400), new Point(600,600), new Point(150,500));
        DrawFrame d = new DrawFrame("Shapes", shapes, 800, 1000);
    }
}