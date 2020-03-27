class Box
{
    int l,w;
    String name;

    // constructor with Zero Parameter
    Box()
    {
        l=w=0;
        name="No Shape";
    }

    // constructor with One Parameter
    Box(int x)
    {
        l=w=x;
        name="Square";
    }

    // constructor with Two Parameter
    Box(int x,int y)
    {
        l=x;
        w=y;
        name="Rectangle";
    }

    void display()
    {
        System.out.println("\n"+name+":\nLength = "+l+"\tWidth = "+w);
    }
}

class ConstructOverload
{
    public static void main(String args[])
    {
        Box b1,b2,b3;

        // Initialize Properties Using Constructor
        b1 = new Box();
        b2 = new Box(45);
        b3 = new Box(12,35);

        // Display Properties
        b1.display();
        b2.display();
        b3.display();
    }
}