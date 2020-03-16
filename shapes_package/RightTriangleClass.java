package shapes_package;
import java.lang.Math;

public class RightTriangleClass extends ShapesProperty{
    public RightTriangleClass(double h, double b)
    {
        area = (double) (0.5 * (h * b));
        perimeter = (double) (h + b + Math.sqrt((h * h) + (b * b)));
    }
}