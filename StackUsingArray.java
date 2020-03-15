import java.util.*;
class StackClass
{
  int size;
  int top=-1;
  int[] stack;

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
      System.out.print("->"+stack[i]);
    }
    System.out.print("\n");
  }
}

class StackUsingArray
{
  public static void main(String args[])
  {
    StackClass stobj = new StackClass(10);
    int data,ch;
    Scanner sc = new Scanner(System.in);

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
  }
}
