/*Room Class Using Constructor*/
class RoomClass2
{
    int length,width;
    // Constructor Declaration
    RoomClass2(int l,int w)
    {
        length = l;
        width = w;
    }
    void display()
    {
        System.out.println("Length = "+length+"\tWidth = "+width);
    }

    public static void main(String[] args) 
    {
        RoomClass2 room1 = new RoomClass2(78,95);
        RoomClass2 room2 = new RoomClass2(54,66);

        System.out.print("\nRoom 1\t");
        room1.display();
        System.out.print("\nRoom 2\t");
        room2.display();
    }
}