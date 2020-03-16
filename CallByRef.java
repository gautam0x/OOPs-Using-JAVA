import java.util.Scanner;

// Create Own Data Class to pass as reference
class MyIntClass
{
    int data;
    MyIntClass(int d)
    {
        data = d;
    }
}

class CallByRef{
    public static void main(String[] args) {

        MyIntClass a,b;
        Scanner sc = new Scanner(System.in);
        
        // Take 2 value form user input
        System.out.println("Enter Value of A and B ");
        a = new MyIntClass(sc.nextInt());
        b = new MyIntClass(sc.nextInt());

        // Close Scanner instance
        sc.close();
        
        System.out.println("Value Of A and B In Main Before Swap : "+a.data+" "+b.data);

        // call by reference
        swap(a,b);

        System.out.println("Value Of A and B In Main After Swap : "+a.data+" "+b.data);

    }

    // Swap function 
    public static void swap(MyIntClass a,MyIntClass b)
    {
        MyIntClass temp = new MyIntClass(a.data);
        a.data = b.data;
        b.data = temp.data;

        System.out.println("Value Of A and B Inside Swap function : "+a.data+" "+b.data);
    }
}