class FirstThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("First Thread : "+i);
        }
    }
}

class SecondThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Second Thread : "+i);
        }
    }
}

class ThreadsRunnable 
{
    public static void main(String[] args)
    {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        
        firstThread.start();
        secondThread.start();
    }
}