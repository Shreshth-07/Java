import java.util.Scanner;
class Myexception extends Exception
{
    public Myexception(String s)
    {
        super(s);
    }
}
public class UserException
{
    static void validate(String str)throws Myexception
    {
        String[] s={"graphic","GRAPHIC"};
        boolean found=false;
        for(String n:s)
        {
            if(n.equalsIgnoreCase(str))
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Valid String");
        }
        else
        {
            throw new Myexception("Not Valid String"); 
        }
    }
    public static void main(String[] args)
    {
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        str=sc.nextLine();
        try
        {
          validate(str);   
        }
        catch(Myexception ex)
        {
            System.out.println("Caught Exception");
            System.out.println(ex.getMessage());
        }
    }
}