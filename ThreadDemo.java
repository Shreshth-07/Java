class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
        for(int i=1;i<=3;i++)
        {
            System.out.println("Thanks"+Thread.currentThread().getName()+" : "+i);
        }
    }
}
class ThreadDemo
{ 
    public static void main(String[] args)
    {
        MyThr t1=new MyThr(" S1");
        MyThr t2=new MyThr(" S2");
        MyThr t3=new MyThr(" S3");
        MyThr t4=new MyThr(" S4");
        MyThr t5=new MyThr(" S5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}