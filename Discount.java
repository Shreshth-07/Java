import java.util.*;
class Discount
{
 public static void main(String[] args)
 {

   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the item type(M/H)");
   char c=scan.nextLine().toUpperCase().toCharArray()[0];
   System.out.print("Enter the cost:");  
   double cost=scan.nextDouble();
   double dis=discount(c,cost);
   double netAmt=cost-dis;
   System.out.println("The net paid amount="+netAmt);

 }

 public static double discount(char typ, double cost) 
    {
       double dis = 0;
       double rate = 0;
       switch (typ) 
       {
           case 'M':
               if (cost > 100 && cost <= 200) 
               {
                   rate = 5;
               } 
               else if (cost > 200 && cost <= 300) 
               {
                   rate = 7.5;
               } 
               else if (cost > 300) 
               {
                   rate = 10;
               }
               break;
           case 'H':
               if (cost > 0 && cost <= 100) 
               {
                   rate = 5;
               } 
               else if (cost > 100 && cost <= 200) 
               {
                   rate = 7.5;
               } 
               else if (cost > 200 && cost <= 300) 
               {
                   rate = 10;
               }
               else if (cost > 300) 
               {
                   rate = 15;
               }
               break;
       }
       dis = cost * rate / 100;
       return dis;
   }
}

