import java.applet.Applet;
import java.awt.Graphics;

public class TextApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello : This is textual content", 90,50);
    }
}