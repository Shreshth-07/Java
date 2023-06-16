import java.util.Scanner;
    class MyNation extends Exception{
    String s1;
    MyNation(String s2)
    {
        this.s1=s2;
    }

    public String toString()
    {
    return s1;
    }

    public static void main(String[] args) {
        String s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string");
        s3=sc.nextLine();

        try {
        if(!"jai hind".equalsIgnoreCase(s3))
        throw new MyNation("My Nation caught!!!");

        else {
            System.out.println("String matched!!!");
            }
        }

        catch(MyNation e) {
            System.out.println(e);
        }
    }
    }