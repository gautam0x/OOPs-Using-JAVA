import java.util.*;
class StackClass
{
  int size;
  int top=-1;
  int[] stack;

  // Initialize Empty stack in constructor
  StackClass(int s)
  {
    size = s;
    stack = new int[s];
  }

  boolean isUnderflow()
  {
    if(top==-1) return true;
    else return false;
  }
  boolean isOverflow()
  {
    if(top==size-1) return true;
    else return false;
  }

  void push(int data)
  {
    top++;
    stack[top] = data;
  }

  void pop()
  {
    System.out.println("Popped Data = "+stack[top]);
    top--;
  }

  void display()
  {
    System.out.print("\n *** Current Stack ");
    for(int i=0;i<=top;i++)
    {
      System.out.print(" -> "+stack[i]);
    }
    System.out.print("\n");
  }
}

class StackUsingArray
{
  public static void main(String args[])
  {
    // Declare new stack of size 10
    StackClass stobj = new StackClass(5);

    int data,ch;
    Scanner sc = new Scanner(System.in);

    // Take Input From User
    do
    {
      System.out.print("\n1> Push\n2> Pop\n3> Disp\n0> Quit\nChoose Option : ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 1:
        System.out.print("Enter Data To Push => ");
        data = sc.nextInt();
        if(stobj.isOverflow())
          System.out.println("\n===[ Stack Is Overflow ]===");
        else
          stobj.push(data);
        break;

        case 2:
        if(stobj.isUnderflow())
          System.out.println("\n===[ Stack Is Underflow ]===");
        else
          stobj.pop();
        break;

        case 3:
        stobj.display();
        break;
      }
      }while(ch!=0);

      sc.close();
  }
}
