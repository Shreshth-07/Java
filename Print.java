class Pyramid
{
    synchronized void Draw(char c)
    {
        for (int i=0; i<5; i++)   
        {  
        for (int j=5-i; j>1; j--)   
        {  
        System.out.print(" ");   
        }  
        for (int j=0; j<=i; j++ )   
        {      
        System.out.print(c+" ");   
        }
        System.out.println();   
        }   
    }
}
class A extends Thread
{
    Pyramid p;
    A(Pyramid p)
    {
        this.p=p;
    }
    public void run()
   {
    p.Draw('*');
   } 
}
class B extends Thread
{
    Pyramid p;
    B(Pyramid p)
    {
        this.p=p;
    }
    public void run()
    {
        p.Draw('#');
    }
}
class Print
{
    public static void main(String[] args)
    {
        Pyramid obj=new Pyramid();
        A tA=new A(obj);
        B tB=new B(obj);
        tA.start();
        tB.start();
    }
}