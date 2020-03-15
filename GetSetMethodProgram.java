class Room
{
    int l,b;

    void setData()
    {
        l=b=0;
    }

    void setData(int x)
    {
        l=b=x;
    }

    void setData(int x,int y)
    {
        l=x;
        b=y;
    }

    void display()
    {
        System.out.println("\nLength "+l);
        System.out.println("Beadth "+b);
    }
}

class GetSetMethodProgram
{
    public static void main(String args[])
    {
        Room R1 = new Room();
        R1.setData();

        Room R2 = new Room();
        R2.setData(22);

        Room R3 = new Room();
        R3.setData(56,86);

        R1.display();
        R2.display();
        R3.display();
    }
}


