abstract class Figure
{
  double dim1;
  double dim2;

  Figure(double d1, double d2)
  {
    dim1=d1;
    dim2=d2;
  }

  abstract void area();
}

class Triangle extends Figure
{
  Triangle(double d1,double d2)
  {
    super(d1,d2);
  }

  void area()
  {
    System.out.println("Area of Triangle :  = " +(dim1*dim2)/2);
  }
}

class Rectangle extends Figure
{
  Rectangle(double d1,double d2)
  {
    super(d1,d2);
  }

  void area()
  {
    System.out.println("Rectangle Area = "+dim1*dim2);
  }
}

class AbstractClassProgam
{
  public static void main(String args[])
  {
    Triangle T=new Triangle(6,7);
    Rectangle R=new Rectangle(7,8);

    // Dynamic Dispatch
    Figure fig;

    fig = T;
    fig.area();
    fig = R;
    fig.area();
  }
}
