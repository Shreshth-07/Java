import java.util.Scanner;
 class Calculator
{
    public static void main(String args[]) 
    {
        double a,b,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("......Calculator......");
        System.out.println("Enter First no.= ");
        a=sc.nextDouble();
        System.out.println("Enter Second no.= ");
        b=sc.nextDouble();
        System.out.println("Enter your choice :\n 1.For Addition(+)\n 2.For Subtraction(-)\n 3.For Multiplication(*)\n 4.For Division(/)\n 5.For Modulus(%)\n");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            sum=a+b;
            System.out.println(a+"+"+b+"= "+sum);
            break;

            case 2:
            sum=a-b;
            System.out.println(a+"-"+b+"= "+sum);
            break;

            case 3:
            sum=a*b;
            System.out.println(a+"*"+b+"= "+sum);
            break;

            case 4:
            if(a==0)
            {
            System.out.println("Enter Correct Value...");
            }
            else
            {
            sum=a/b;
            System.out.println(a+"/"+b+"= "+sum);
            break;
            }
            
            case 5:
            if(a<b)
            {
            System.out.println("Enter Correct Value...");
            }
            else
            {
            sum=a%b;
            System.out.println(a+"%"+b+"= "+sum);
            break;
            }
        }
    }
}