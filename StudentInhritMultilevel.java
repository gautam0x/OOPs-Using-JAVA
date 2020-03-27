class Student
{
    int roll;
}

class Test extends Student
{
    double marks1,marks2;
    void getMarks(double m1,double m2)
    {
        marks1 = m1;
        marks2 = m2;
    }
    void putMarks()
    {
        System.out.println("\nRoll No : "+roll+"\tMarks 1 : "+marks1+"\tMarks 2 : "+marks2);
    }
}

class Result extends Test
{
    double total;

    // initialize roll number using constructor
    Result(int r)
    { roll = r ; }

    // Display Total Result
    void displayTotal()
    {
        total = marks1+marks2;
        System.out.println("Roll No : "+roll+"\tTotal Marks : "+total);
    }
}

class StudentInhritMultilevel
{
    public static void main(String[] args)
    {
        Result stud1,stud2,stud3 ;

        // Initialize Students and Roll No
        stud1 = new Result(150);
        stud2 = new Result(151);
        stud3 = new Result(152);

        // Set marks1 and marks2
        stud1.getMarks(40, 31);
        stud2.getMarks(45, 52);
        stud3.getMarks(63, 45);

        // Display Marks
        stud1.putMarks();
        stud1.displayTotal();

        stud2.putMarks();
        stud2.displayTotal();

        stud3.putMarks();
        stud3.displayTotal();
    }
}
