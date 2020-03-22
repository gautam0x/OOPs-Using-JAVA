package shapes_package;
import java.lang.Math;

public class CircleClass extends ShapesProperty{
    public CircleClass(double r)
    {
        area = (double) (Math.PI * r * r);
        perimeter = (double) (2*Math.PI*r);
    }
}