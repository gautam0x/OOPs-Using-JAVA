import java.util.Scanner;

class CallByValue{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        // Take 2 value form user input
        System.out.println("Enter Value of A and B ");
        a = sc.nextInt();
        b = sc.nextInt();

        // Close Scanner instance
        sc.close();
        
        System.out.println("Value Of A and B In Main Before Swap : "+a+" "+b);

        // call by value
        swap(a,b);

        System.out.println("Value Of A and B In Main After Swap : "+a+" "+b);

    }

    // Swap function 
    public static void swap(int a,int b)
    {
        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println("Value Of A and B Inside Swap function : "+a+" "+b);
    }
}