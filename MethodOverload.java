class Box
{
    int l,w;
    String name;

    // setData with Zero Parameter
    void setData()
    {
        l=w=0;
        name="No Shape";
    }

    // setData with One Parameter
    void setData(int x)
    {
        l=w=x;
        name="Square";
    }

    // setData with Two Parameter
    void setData(int x,int y)
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

class MethodOverload
{
    public static void main(String args[])
    {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();

        // Assign Box Data Using Method Overloading
        b1.setData();
        b2.setData(20);
        b3.setData(35,40);

        // Display Properties
        b1.display();
        b2.display();
        b3.display();
    }
}