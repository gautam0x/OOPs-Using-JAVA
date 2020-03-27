class Room
{
    int length,width;
}

class Bedroom extends Room
{
    int height;
    void getData(int l,int w,int h)
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

class RoomInherit
{
    public static void main(String[] args) 
    {
        Bedroom bedroom1 = new Bedroom();
        Bedroom bedroom2 = new Bedroom();

        // SetData L B H
        bedroom1.getData(12, 13, 78);
        bedroom2.getData(54, 74, 68);

        // Output 
        System.out.print("\nBedRoom 1\t");
        bedroom1.display();
        System.out.print("\nBedRoom 2\t");
        bedroom2.display();
    }
}
