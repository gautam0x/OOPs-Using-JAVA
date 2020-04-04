class Message
{
    // Question Thread will be Execute First
    boolean isAnswer = false;
 
    // Question Output
    public synchronized void Question(String message)
    {
        if (isAnswer)
        {
            try { wait(); }
            catch (InterruptedException e) {}
        }

        System.out.println("Student : "+message);
        isAnswer = true;
        notify();
    }

    // Answer Output
    public synchronized void Answer(String message)
    {
        if (!isAnswer)
        {
            try {wait();}
            catch (InterruptedException e) {}
        }

        System.out.println("Teacher : "+message);
        isAnswer = false;
        notify();
    }
 }
 
 // Create Person For Conversation
 class Person extends Thread
 {
    Message messageObj;
    String[] queryArray;
    String personType;
 
    // Initialize Constructor
    public Person(String personType,Message messageObj,String[] queryArray)
    {
        this.personType = personType;
        this.messageObj = messageObj;
        this.queryArray = queryArray;
    }

    public void run()
    {
        // If Teacher (Ask Question) Else (Give Answer)
        if(personType == "teacher")
        {
            for (int i = 0; i < queryArray.length; i++)
            { messageObj.Question(queryArray[i]); }
        }
        else
        {            
            for (int i = 0; i < queryArray.length; i++)
            { messageObj.Answer(queryArray[i]); }
        }
    }
 }
 
 public class MessagePassThread {
    public static void main(String[] args)
    {
        // Define Question and Their Answer in String Array
        String[] questionArray = { "Hello Students | Good Morning", "Today Class Will Be Held From 11:35 Am", "Stay Safe Everyonce ! Stay Home" };
        String[] answerArray = { "Good Mornig Mam", "OK Mam", "You Too Mam" };

        Message messageObj = new Message();

        // Define 2 Threads To Communicate
        Person teacher = new Person( "teacher",messageObj, questionArray);
        Person student = new Person( "student",messageObj, answerArray);

        // Start Threads
        student.start();
        teacher.start();
    }
 }