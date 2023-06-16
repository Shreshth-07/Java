import java.util.Scanner;
 class power
{
    public static void main(String []args)
    {
        int a,res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            res=a*a;
        } 
        System.out.print(a+"^2 = "+res);
    }
}