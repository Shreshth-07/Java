    import java.util.*;
    class Duplicate 
    {
        public static String unique(String s)
    {
        String str = new String();
        int len = s.length();
        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
         System.out.println("String after Removing Duplicate :");
         return str;
    }
     public static void main(String[] args)
    {
         String s =" ";
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String :");
         s=sc.nextLine();
        System.out.println(unique(s));
    }
}