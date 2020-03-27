import java.util.Scanner;

class Student
{
    int roll;
    void putRollNumber()
    {
        System.out.println("\nRoll = "+roll);
    }
    void getRollNumber(int x)
    {
        roll=x;
    }
}

class Test extends Student
{
    int sub1,sub2;
    void getMarks(int x,int y)
    {
        sub1=x;
        sub2=y;
    }
    void putMarks()
    {
        System.out.println("Marks = "+sub1+" "+sub2);
    }
}

interface Sport
{
    int spMarks=75;
    void putSp();
}

// Inhherit Test with Sport Interface
class Result extends Test implements Sport
{
    int total;
    public void putSp()
    {
        System.out.println("Sports = "+spMarks);
    }

    void display()
    {
        putRollNumber();
        putSp();
        putMarks();

        total=spMarks+sub1+sub2;
        System.out.println("Total = "+total);
    }
}

class StudentInterface
{
    public static void main(String args[])
    {
        Result stud = new Result();
        Scanner sc = new Scanner(System.in);
        int roll,mrk1,mrk2;

        // Get Roll
        System.out.print("\nEnter Student Roll No. : ");
        roll = sc.nextInt();
        stud.getRollNumber(roll);

        // Get Marks
        System.out.print("\nEnter Student Marks 1 : ");
        mrk1 = sc.nextInt();
        System.out.print("\nEnter Student Marks 2 : ");
        mrk2 = sc.nextInt();
        stud.getMarks(mrk1,mrk2);

        // Display Total
        stud.display();
        sc.close();
    }
}
