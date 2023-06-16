import java.util.Scanner;
 class Marks
{
    public static void main(String[] args) 
    {
        System.out.println("!!.....GRADE.....!!");
        double a,b,c,sum,avg;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks of Physics : ");
        a=sc.nextDouble();
        System.out.println("Enter Marks of Maths : ");
        b=sc.nextDouble();
        System.out.println("Enter Marks of Chemistry : ");
        c=sc.nextDouble();
        sum= a+b+c;
        avg=sum/3;
        if(avg<=100 && avg>=81)
        {
            System.out.println("Grade A");
            System.out.println("Total = "+avg);
        }
        if(avg<=80 && avg>=61)
        {
            System.out.println("Grade B");
            System.out.println("Total = "+avg);
        }
        if(avg<=60 && avg>=41)
        {
            System.out.println("Grade C");
            System.out.println("Total = "+avg);
        }
        if(avg<=40 && avg>=0)
        {
            System.out.println("...Fail...");
            System.out.println("Total = "+avg);
        }
    }
}