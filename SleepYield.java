import java.lang.*;
  
class Demo extends Thread implements Runnable {
    Thread t;
    public void run()
    {
        //for sleep
        System.out.println("Using Sleep.");
        for (int i = 0; i<3; i++) 
        {
            System.out.println(Thread.currentThread().getName() + "  "+ i);
            try {
                Thread.sleep(1000);
            }
  
            catch (Exception e) {
                System.out.println(e);
            }
        }
        //for yield
        System.out.println("Using Yield.");
        for(int i=0;i<2;i++)
        {
            System.out.println(Thread.currentThread().getName() + "  in control");
        }
    }
}
class SleepYield
{ 
    public static void main(String[] args) throws Exception
    {
        Demo t1=new Demo();
        Demo t2=new Demo();
        t1.start();
        t2.start();
        //for Yield
        for(int i=0;i<1;i++)
        {
            t1.yield();
            System.out.println("In control "+Thread.currentThread().getName());
        }
    }
}