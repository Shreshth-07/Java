import java.util.Scanner;
class Student
{
    private int id;
    private String name,branch,city,university;

    public Student(int id,String name,String city,String branch)
    {
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.city=city;
        this.university="Graphic Era Hill University";
    }
    public Student(int id,String name,String city,String branch,String university)
    {
        this(id,name,city,branch);
        this.university=university;
    }
    public int getid()
    {
        return this.id;
    }
    public String getname()
    {
       return this.name;
    }
    public String getcity()
    {
        return this.city;
    }
    public String getbranch()
    {
        return this.branch;
    }
    public String getunivesity()
    {
        return this.university;
    }
}
class Student_Overloading
{
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        Scanner sc4=new Scanner(System.in);
        Scanner sc5=new Scanner(System.in);
        Scanner sc6=new Scanner(System.in);
        
        System.out.println("Enter the Student Id :");
        int id= sc1.nextInt();
        System.out.println("Enter the Student Name :");
        String name=sc2.nextLine();
        System.out.println("Enter the Student City :");
        String city=sc3.nextLine();
        System.out.println("Enter the Student Branch :");
        String branch=sc4.nextLine();
        while(true)
        {
        System.out.println("Does you belong to Graphic Era Hill University [Y/N]]:");
        String answer=sc5.nextLine();

        if(answer.equalsIgnoreCase("Y"))
        {
            Student s=new Student(id, name, city, branch);
            System.out.println("Enter the Student Id :"+s.getid());
            System.out.println("Enter the Student Name :"+s.getname());
            System.out.println("Enter the Student City :"+s.getcity());
            System.out.println("Enter the Student Branch :"+s.getbranch());
            break;
        }
        else if(answer.equalsIgnoreCase("N"))
        {
            System.out.println("Enter the College Name :");
            String c_name=sc6.nextLine();
            Student s=new Student(id, name, city, branch, c_name);
            System.out.println("Enter the Student Id :"+s.getid());
            System.out.println("Enter the Student Name :"+s.getname());
            System.out.println("Enter the Student City :"+s.getcity());
            System.out.println("Enter the Student Branch :"+s.getbranch());
            System.out.println("Enter the Student College :"+s.getunivesity());
            break;
        }
        else
        {
            System.out.println("<<<<<.WRONG INPUT.>>>>>");
        }
        }
    }
}