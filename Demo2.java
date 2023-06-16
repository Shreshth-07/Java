import java.util.StringTokenizer;

public class Demo2
{
    public static void main(String[] args)
    {
        StringTokenizer st1=new StringTokenizer("Hello,i,am,java");
        System.out.println("TT:"+st1.countTokens());
        System.out.println("nt:"+st1.nextToken(","));

        StringTokenizer st2=new StringTokenizer("Hello i am java"," ");
        System.out.println("TT:"+st2.countTokens());

        StringTokenizer st3=new StringTokenizer("Hello i am java"," ");
        while(st3.hasMoreTokens())
        {
            System.out.println(st3.nextToken()); 
        }

        StringTokenizer st4=new StringTokenizer("Hello i am java"," ");
        while(st4.hasMoreElements())
        {
            System.out.println(st4.nextToken()); 
        }

        StringTokenizer st5=new StringTokenizer("Hello i am java"," ");
        while(st5.hasMoreTokens())
        {
            System.out.println(st5.nextElement()); 
        }
    }
}