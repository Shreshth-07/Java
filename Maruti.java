import java.util.Scanner;
class Maruti
{
    public static void main(String[] args)
    {
        boolean a=true;
    int dk10=0,das=0,dwa=0,dsx4=0;
    int mk10=0,mas=0,mwa=0,msx4=0;
    int ck10=0,cas=0,cwa=0,csx4=0;
    int kk10=0,kas=0,kwa=0,ksx4=0;

    Scanner sc=new Scanner(System.in);
    int c=0;
    do
    {
    System.out.println("Enter the City:\n1.Delhi\n2.Mumbai\n3.Chennai\n4.Kolkata\n5.Exit");
    c=sc.nextInt();
    switch(c)
    {
        case 1:
        {
        System.out.println("Enter the Model :\n1.Maruti-K10\n2.Zen-Astelo\n3.Wagnor\n4.Maruti-SX4");
        int m=sc.nextInt();
        switch(m)
        {
            case 1:
            dk10++;
            break;
            case 2:
            das++;
            break;
            case 3:
            dwa++;
            break;
            case 4:
            dsx4++;
            break;
            case 5:
            break;
        }
        break;
        }
        case 2:
        {
            System.out.println("Enter the Model :\n1.Maruti-K10\n2.Zen-Astelo\n3.Wagnor\n4.Maruti-SX4");
            int m=sc.nextInt();
            switch(m)
            {
                case 1:
                mk10++;
                break;
                case 2:
                mas++;
                break;
                case 3:
                mwa++;
                break;
                case 4:
                msx4++;
                break;
                case 5:
                break;
            }
            break;
        }
        case 3:
        {
            System.out.println("Enter the Model :\n1.Maruti-K10\n2.Zen-Astelo\n3.Wagnor\n4.Maruti-SX4");
            int m=sc.nextInt();
            switch(m)
            {
                case 1:
                ck10++;
                break;
                case 2:
                cas++;
                break;
                case 3:
                cwa++;
                break;
                case 4:
                csx4++;
                break;
                case 5:
                break;
            }
            break;
        }
        case 4:
        {
            System.out.println("Enter the Model :\n1.Maruti-K10\n2.Zen-Astelo\n3.Wagnor\n4.Maruti-SX4\n5.Back");
            int m=sc.nextInt();
            switch(m)
            {
                case 1:
                kk10++;
                break;
                case 2:
                kas++;
                break;
                case 3:
                kwa++;
                break;
                case 4:
                ksx4++;
                break;
                case 5:
                break;
            }
            break;
        }
        case 5:
        a=false;
        break;
    }
    }
    while(a);

    System.out.println("In Delhi:\n1.Maruti-K10:"+dk10+"\n2.Maruti Zen-Astelo:"+das+"\n3.Maruti Wagnor:"+dwa+"\n4.Maruti-SX4:"+dsx4);
    System.out.println("In Mumbai:\n1.Maruti-K10:"+mk10+"\n2.Maruti Zen-Astelo:"+mas+"\n3.Maruti Wagnor:"+mwa+"\n4.Maruti-SX4:"+msx4);
    System.out.println("In Chennai:\n1.Maruti-K10:"+ck10+"\n2.Maruti Zen-Astelo:"+cas+"\n3.Maruti Wagnor:"+cwa+"\n4.Maruti-SX4:"+csx4);
    System.out.println("In Kolkatta:\n1.Maruti-K10:"+kk10+"\n2.Maruti Zen-Astelo:"+kas+"\n3.Maruti Wagnor:"+kwa+"\n4.Maruti-SX4:"+ksx4);
    }
}