import java.util.Scanner;

class TryCatchExample
{
    public static void main(String[] args)
    {
        int a,x,y,z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers : ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        try
        {
            // Any Arithemetic Error will be forwarded to catch block
            a = x/(y-z);
            System.out.println("A = "+a);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("==> Finally Blocks Executed After All <==");
        }

        sc.close();
    }
}