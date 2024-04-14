import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.Random;

public class DrawFrame extends JFrame {

    private Shape[] shapes;
    private int width;
    private int height;

    Color color;
    private static Random random = new Random();

    public DrawFrame(String title, Shape[] shapes1 , int width, int height) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        this.width=width;
        this.height=height;
        shapes = shapes1;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, width, height);
        for (Shape sh : shapes) {
            g2.setColor(getRandomColor());
            g2.fill(sh.getPolygon());
        }
    }

    static Color getRandomColor() {
        float alpha = random.nextFloat();
        float red = random.nextFloat();
        float green = random.nextFloat();
        float blue = random.nextFloat();
        return new Color(red, green, blue, alpha);
    }
}