abstract class Shape
{
    double height,width;

    // Set height and width Rect And Triangle
    public void setProperties(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    // Set height and width Square
    public void setProperties(double edge)
    {
        this.height = this.width = edge;
    }
}

class Rectangle extends Shape
{
    //Calculate and return area of rectangle
    double getArea()
    {
        return height * width;
    }
}

class Triangle extends Shape
{
    //Calculate and return area of rectangle
    double getArea()
    {
        return (height * width)/2;
    }
}

class Square extends Shape
{
    //Calculate and return area of rectangle
    double getArea()
    {
        return height * width;
    }
}


class ShapeAbstractPolymo
{
    public static void main(String[] args)
    {
        Shape shape;

        // Initializing Child classes reference
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Square square = new Square();

        // Runtime polymorphism Rectangle
        shape = rect;
        shape.setProperties(78, 5);
        System.out.println("Area of rectangle : " + rect.getArea());

        // Runtime polymorphism Square
        shape = square;
        shape.setProperties(23);
        System.out.println("Area of Square : " + square.getArea());

        // Runtime polymorphism Triangle
        shape = tri;
        shape.setProperties(78, 5);
        System.out.println("Area of Triangle : " + tri.getArea());
    }
}