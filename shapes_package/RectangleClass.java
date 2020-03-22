package shapes_package;

public class RectangleClass extends ShapesProperty{
    public RectangleClass(double l, double b)
    {
        area = l*b;
        perimeter = 2*(l+b);
    }
}