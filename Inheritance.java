import java.io.*;
import java.util.*;
class Student
{
   Scanner sc=new Scanner(System.in);
   int RNo,Total=0,sub;
   String name;
   int marks[];
   Student()
   {
      System.out.print("Enter Registration No.: ");
      RNo=sc.nextInt();
      System.out.print("Enter Student Name: ");
      name=sc.next();;
      Marks();
   }
   public void Marks()
   {
       marks=new int[3];
       System.out.print("Enter marks of Physics: ");
       marks[0]=sc.nextInt();
       System.out.print("Enter marks of Chemistry: ");
       marks[1]=sc.nextInt();
       System.out.print("Enter marks of Maths: ");
       marks[2]=sc.nextInt();
       for(int i=0;i<3;i++)
       {
          Total+=marks[i];
       }
       System.out.println("Total Marks of student "+name+": " +Total);
   }
}
class Inheritance
{
    public static void main(String args[])
    {
        Student s[]=new Student[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Student :");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
              s[i]=new Student();
     }
}