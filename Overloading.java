 class Overloading
{
    public static void main(String []args)
    {
        Overloading a=new Overloading();
        System.out.println(a.calc(25));
        System.out.println(a.calc("26","24"));
        System.out.println(a.calc(45,8888888888.0));
        System.out.println(a.calc(25,48));
    }
     public int calc(int a)
    {
        System.out.println("calc(int a) is called");
        return a+1;
    }
    public int calc(String a,String b)
    {
        System.out.println("calc(String a, String b) is called");
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
    public Double calc(int a,double b)
    {
        System.out.println("calc(int a,Double b) is called");
        return a+b;
    }
    public Float calc(int a,float b)
    {
        System.out.println("calc(int a,Float b) is called");
        return a+b;
    }
}