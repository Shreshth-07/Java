import java.util.Scanner;
class Bank_Account
{
    String name="";
    String A_type="";
    private int A_no;
    int Balance=0;
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    Scanner sc3=new Scanner(System.in);

    public void Detail()
    {
        System.out.println("Enter Account Holder Name :");
        name=sc1.nextLine();
        
        System.out.println("Enter Account Number :");
        A_no=sc2.nextInt();

        System.out.println("Enter Account Type :");
        A_type=sc3.nextLine();
    
    }
    public void Deposit()
    {
        System.out.println("Enter the Amount to Deposit :");
        Balance=sc1.nextInt();
        System.out.println("Balance Amount :"+Balance);
    }
    public void Withdraw()
    {
        System.out.println("Enter the Amount to Withdraw :");
        int w=sc1.nextInt();
        if(w<=Balance)
        {
        System.out.println("!!..Withdraw Sucessful...!!");
        Balance=Balance-w;
        System.out.println("Current Balance :"+Balance);
        }
        else
        {
            System.out.println("!!!...Withdraw denied Due to Low Amount...!!!");
            System.out.println("Current Balance :"+Balance);
        }
    }
    public void Display()
    {
        System.out.println("Account Holder name :"+name);
        System.out.println("Current Balance :"+Balance);
    }
}
public class Bank
{
    public static void main(String[] args)
    {
        int c;
        boolean a=true;
        Bank_Account b=new Bank_Account();
        Scanner s=new Scanner(System.in);
        System.out.println("<<<<....WELCOME....>>>>");
        System.out.println("Enter DETAILS:");
        
        b.Detail();
        do
        {
        System.out.println("1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
        c=s.nextInt();
        switch(c)
        {
            case 1:
            b.Deposit();
            break;
            
            case 2:
            b.Withdraw();
            break;
            
            case 3:
            b.Display();
            break;

            case 4:
            System.out.println("<<<<< HAVE A GOOD DAY >>>>>");
            a=false;
            break;            
        }
        }
        while(a);
    }
}