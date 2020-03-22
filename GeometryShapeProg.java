import shapes_package.*;
import shapes_package.RectangleClass;
 
class GeometryShapeProg{
    public static void main(String[] args) {
                
        // Create Objects Of Diffrent Shape
        RectangleClass R = new RectangleClass(73.53, 50);
        RightTriangleClass T = new RightTriangleClass(15,8);
        CircleClass C = new CircleClass(40);

        ShapesProperty ref;

        // Method Dispatch
        System.out.print("\n Rectangle : ");
        ref = R;
        ref.displayProperty();

        System.out.print("\n Right Triangle : ");
        ref = T;
        ref.displayProperty();

        System.out.print("\n Circle : ");
        ref = C;
        ref.displayProperty();
    }
}