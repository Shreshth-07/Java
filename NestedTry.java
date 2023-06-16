import java.util.Scanner;
class NestedTry
{
    public static void main(String[] args)
    {
        int marks[]=new int[4];
        marks[0]=10;
        marks[1]=15;
        marks[2]=25;
        marks[3]=30;
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        while(true)
        {
            System.out.println("Enter Index value :");
            int i=sc.nextInt();
            try
            {
                System.out.println("Welcome to Programming");
                try
                {
                    System.out.println(marks[i]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Wrong Index");
                    System.out.println("Exception in lvl-2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exeception in lvl-1");
            }
        }
    }
}