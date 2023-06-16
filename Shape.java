import java.util.Scanner;
class Area
{
    Scanner sc=new Scanner(System.in);
    void area(int l,int b)
    {
       System.out.println("Area of rectangle :"+(l*b));
    }
    void area(int r)
    {
        System.out.println("Area of Circle :"+(3.14*r*r));
    }
    void area(int b,Double h)
    {
        System.out.println("Area of Triangle :"+(0.5*b*h));
    }
}
class Shape
{
    public static void main(String []args)
    {
        Area A=new Area();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        int l=s.nextInt();
        System.out.println("Enter the breadth of Rectangle:");
        int b=s.nextInt();
        A.area(l, b);

        System.out.println("Enter the radius of Circle:");
        int r=s.nextInt();
        A.area(r);

        System.out.println("Enter the Base of Triangle:");
        int ba=s.nextInt();
        System.out.println("Enter the height of Triangle:");
        int he=s.nextInt();
        A.area(ba, he);
    }
} 