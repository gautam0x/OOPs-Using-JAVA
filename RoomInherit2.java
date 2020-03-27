class Room
{
    int length,width;
}

class Bedroom extends Room
{
    int height;

    // Set L W H Usng Constructor
    Bedroom(int l,int w,int h)
    {
        length = l;
        width = w;
        height = h;
    }
    void display()
    {
        System.out.println("Surface Area = "+((2*length*width)+(2*length*height)+(2*height*width))+"\tVolume = "+(length*width*height));
    }
}

class RoomInherit2
{
    public static void main(String[] args) 
    {
        Bedroom bedroom1 = new Bedroom(11, 18, 68);
        Bedroom bedroom2 = new Bedroom(31, 54, 62);

        // Output 
        System.out.print("\nBedRoom 1\t");
        bedroom1.display();
        System.out.print("\nBedRoom 2\t");
        bedroom2.display();
    }
}
