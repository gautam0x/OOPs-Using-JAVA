import java.applet.Applet;
import java.awt.Graphics;

public class ShapesDraw extends Applet
{
    public void paint(Graphics g)
    {
        // Circle 150*150
        g.drawOval(30, 30, 150, 150);
        // Rectangle 200*150
        g.drawRect(210, 30, 200, 150);
        // Oval 200*150
        g.drawOval(30, 210, 150, 100);
        // Square 100*100
        g.drawRect(210, 210, 100, 100);
    }
}