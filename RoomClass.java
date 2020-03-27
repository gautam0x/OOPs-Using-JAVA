class RoomClass
{
    int length,width;
    void getData(int l,int w)
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
        RoomClass room1 = new RoomClass();
        RoomClass room2 = new RoomClass();

        room1.getData(12, 13);
        room2.getData(54, 74);

        System.out.print("\nRoom 1\t");
        room1.display();
        System.out.print("\nRoom 2\t");
        room2.display();
    }
}